package com.sopra.steria.jpinternational.business.validation;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sopra.steria.jpinternational.model.Order;
import com.sopra.steria.jpinternational.model.Orders;
import com.sopra.steria.jpinternational.technicalservice.exception.CISFunctionnalException;
import com.sopra.steria.jpinternational.technicalservice.exception.CISTechnicalException;

@Component
public class DataValidation implements IValidation {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(DataValidation.class);

	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss");

	@Override
	public Object validate(Object object) throws CISTechnicalException,
			CISFunctionnalException, NoSuchFieldException,
			IllegalAccessException {

		LOGGER.info("Entering in DataValidation: validate method");
		Orders orders = (Orders) object;
		List<Order> lstOrder = orders.getOrder();

		for (Order order : lstOrder) {
			LOGGER.info("Order recieve for USID :-" + order.getUsid());
			String message = "DataValidation ";
			StringBuilder sb = new StringBuilder(message);
			validateData(order, sb);
		}

		return true;
	}

	private void validateData(Order order, StringBuilder sb)
			throws NoSuchFieldException, IllegalAccessException,
			CISTechnicalException {
		Field[] declaredFields = order.getClass().getDeclaredFields();

		String[] arrayOfIntField = { "cctSpeed", "oldCctSpeed", "prodId",
				"subprodId", "loisOrderId" };
		List<String> intTypeField = Arrays.asList(arrayOfIntField);

		String[] arrayOfDateField = { "orderDate", "custReqDeliveryDate",
				"validationDate", "revisedValidationDate", "gad", "cdd", "cav",
				"configurationDate", "mav", "rfsDate", "cutDate", "srfDate",
				"btlvsDate" };
		List<String> dateTypeField = Arrays.asList(arrayOfDateField);

		for (Field field : declaredFields) {
			field.setAccessible(true);
			Class<?> fieldType = field.getType();

			String fieldTypeName = fieldType.getName();
			String memberName = field.getName();

			if (field.get(order) != null) {
				if (intTypeField.contains(memberName)) {
					LOGGER.info("Checking fields for number datatype ");
					String value = field.get(order).toString();
					LOGGER.info("MemberName :-" + memberName);
					LOGGER.info("value:-" + value);
					if (!parseStringtoInterger(value)) {
						throw new CISTechnicalException(sb + memberName
								+ " must be Integer ", "4000");
					}
				} else if (dateTypeField.contains(memberName)) {
					LOGGER.info("Checking fields for DATE datatype ");
					String value = field.get(order).toString();
					LOGGER.info("MemberName :-" + memberName);
					if (!parseStringtoDate(value)) {
						throw new CISTechnicalException(sb + memberName
								+ " must be a Valid Date format ", "4001");
					}
				}
			}
		}
	}

	private boolean parseStringtoDate(String value) {
		boolean flag = false;
		try {

			String dateInString = value;

			if (value.contains("T")) {
				new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
						.parse(dateInString);
			} else {
				new SimpleDateFormat("yyyy-MM-dd").parse(dateInString);
			}
			flag = true;
		} catch (ParseException e) {
			flag = false;
		}
		return flag;
	}

	private boolean parseStringtoInterger(String value) {
		boolean flag = false;
		try {
			int tempValue = Integer.parseInt(value);
			LOGGER.info("Parsed value:-" + tempValue);
			flag = true;
		} catch (NumberFormatException e) {
			flag = false;
		}
		return flag;
	}
}

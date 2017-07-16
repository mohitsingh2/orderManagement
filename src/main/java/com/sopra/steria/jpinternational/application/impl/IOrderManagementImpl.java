package com.sopra.steria.jpinternational.application.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sopra.steria.jpinternational.application.IOrderManagement;
import com.sopra.steria.jpinternational.business.formatter.DataFormatter;
import com.sopra.steria.jpinternational.business.service.OrderService;
import com.sopra.steria.jpinternational.business.validation.DataValidation;
import com.sopra.steria.jpinternational.business.validation.IValidation;
import com.sopra.steria.jpinternational.business.validation.MandatoryValidation;
import com.sopra.steria.jpinternational.model.Order;
import com.sopra.steria.jpinternational.model.Orders;
import com.sopra.steria.jpinternational.model.ResponseMessage;
import com.sopra.steria.jpinternational.model.persistent.OrderPersist;
import com.sopra.steria.jpinternational.technicalservice.exception.CISFunctionnalException;
import com.sopra.steria.jpinternational.technicalservice.exception.CISTechnicalException;
import com.sopra.steria.jpinternational.technicalservice.exception.DAOException;

@Component("iOrderManagement")
public class IOrderManagementImpl implements IOrderManagement {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(IOrderManagementImpl.class);

	@Autowired(required = true)
	MandatoryValidation mandatoryValidation;

	@Autowired(required = true)
	 DataValidation dataValidation;

	@Autowired(required = true)
	OrderService iOrderService;

	@Autowired(required = true)
	DataFormatter dataFormatter;

	public MandatoryValidation getMandatoryValidation() {
		return mandatoryValidation;
	}

	public void setMandatoryValidation(MandatoryValidation mandatoryValidation) {
		this.mandatoryValidation = mandatoryValidation;
	}

	public DataValidation getDataValidation() {
		return dataValidation;
	}

	public void setDataValidation(DataValidation dataValidation) {
		this.dataValidation = dataValidation;
	}

	public OrderService getiOrderService() {
		return iOrderService;
	}

	public void setiOrderService(OrderService iOrderService) {
		this.iOrderService = iOrderService;
	}

	public DataFormatter getDataFormatter() {
		return dataFormatter;
	}

	public void setDataFormatter(DataFormatter dataFormatter) {
		this.dataFormatter = dataFormatter;
	}

	@Override
	public ResponseMessage ordersCreate(Orders orders)
			throws CISTechnicalException, CISFunctionnalException, DAOException {
		LOGGER.info(" Validation process start for orders ");
		List<IValidation> validations = new ArrayList<IValidation>();
		validations.add(mandatoryValidation);
		validations.add(dataValidation);

		ResponseMessage message = new ResponseMessage();
		StringBuilder builder = new StringBuilder();
		for (IValidation validation : validations) {
			// To validate all the validations applicable to the particular
			// request
			try {
				validation.validate(orders);
			} catch (NoSuchFieldException e) {
				new CISTechnicalException(" must be a Valid Date format ",
						"4001");
			} catch (IllegalAccessException e) {
				new CISTechnicalException(" must be a Valid Date format ",
						"4001");
			}
		}

		List<Order> lstOrder = orders.getOrder();

		for (Order order : lstOrder) {
			OrderPersist orderPersist = dataFormatter.format(order);
			try {
				iOrderService.saveOrder(orderPersist);
			} catch (Exception exception) {
				throw new DAOException("Error occured while persisting Data"
						+ exception.getMessage(), exception);
			}
			builder.append(" Usid for The given Order " + order.getUsid()
					+ builder.append(" "));
		}
		message.setUsid(builder.toString());
		return message;
	}

}

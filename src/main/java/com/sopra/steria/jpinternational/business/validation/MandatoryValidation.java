package com.sopra.steria.jpinternational.business.validation;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sopra.steria.jpinternational.constant.MessageConstants;
import com.sopra.steria.jpinternational.model.Order;
import com.sopra.steria.jpinternational.model.Orders;
import com.sopra.steria.jpinternational.technicalservice.exception.CISFunctionnalException;

@Component
public class MandatoryValidation implements IValidation, MessageConstants {
    private static final Logger LOGGER = LoggerFactory.getLogger(MandatoryValidation.class);


    @Override
    public Object validate(Object o) throws CISFunctionnalException {

        LOGGER.info("Enter in Mandatory Validation");
        Orders orders = (Orders) o;
        List<Order> lstOrder = orders.getOrder();
        for (Order order : lstOrder) {

        	LOGGER.info("Order for the usid id***********"+ order.getUsid());
            String message = "Mandatory Parameter";
            StringBuilder sb = new StringBuilder(message);

            mandatoryCheckProductType(order, sb);
            
        }
        return true;
    }

    public void mandatoryCheckProductType(Order order, StringBuilder msg) throws CISFunctionnalException {
        // check for product type
        if (order.getUsid() == null) {
            throw new CISFunctionnalException(msg + " USID must not be Null.",
                    MessageConstants.ERRORCODE_MANDATORY_PARAMETERS_MISSING);
        }
    }

 }

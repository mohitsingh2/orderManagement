package com.sopra.steria.jpinternational.providerrest.service.impl;

import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sopra.steria.jpinternational.application.IOrderManagement;
import com.sopra.steria.jpinternational.constant.MessageConstants;
import com.sopra.steria.jpinternational.model.Orders;
import com.sopra.steria.jpinternational.model.ResponseMessage;
import com.sopra.steria.jpinternational.providerrest.service.OrdersApi;
import com.sopra.steria.jpinternational.technicalservice.exception.CISFunctionnalException;
import com.sopra.steria.jpinternational.technicalservice.exception.CISTechnicalException;
import com.sopra.steria.jpinternational.technicalservice.exception.DAOException;

@Component
public class OrderApiImpl implements OrdersApi {

	public static final Logger LOGGER = LoggerFactory
			.getLogger(OrderApiImpl.class);

	@Autowired(required = true)
	IOrderManagement iOrderManagement;

	public IOrderManagement getiOrderManagement() {
		return iOrderManagement;
	}

	public void setiOrderManagement(IOrderManagement iOrderManagement) {
		this.iOrderManagement = iOrderManagement;
	}

	@Override
	public Response orderCreate(Orders orders) {

		LOGGER.info("List of input Orders :" + orders.getOrder());
		Response response = null;
		try {
			ResponseMessage responseMessage = iOrderManagement
					.ordersCreate(orders);
			LOGGER.info(" Order Transaction has been completed :"
					+ responseMessage);
			responseMessage.setMessage("Order inserted successfully");
			responseMessage.setStatus(Response.Status.CREATED.toString());
			response = Response.status(Response.Status.CREATED)
					.entity(responseMessage).build();

		} catch (CISFunctionnalException exception) {
			response = getErrorResponse(exception, 2);
			LOGGER.info(" Functional Error occured during Order processing :"
					+ response);
		} catch (CISTechnicalException exception) {
			response = getErrorResponse(exception, 1);
			LOGGER.info(" Technical Error occured during Order processing :"
					+ response);
		} catch (DAOException e) {

			response = getErrorResponse(e, 3);
			LOGGER.info(" Error occured during Order processing :" + response);
		}
		return response;
	}

	private Response getErrorResponse(Exception e, int type) {

		Response response = null;

		LOGGER.debug(MessageConstants.ERROR_MSZ_EXP_CAUSE + e.getCause()
				+ MessageConstants.ERROR_MSZ_EXP + e.getMessage());
		LOGGER.error(MessageConstants.EXCEPTION, e);
		com.sopra.steria.jpinternational.technicalservice.exception.Error error;
		if (type == 1) {
			LOGGER.info(" Exception Raise for Type = 1 :");
			CISTechnicalException cisException = (CISTechnicalException) e;
			error = new com.sopra.steria.jpinternational.technicalservice.exception.Error(Integer.parseInt(cisException.getErrorkey()),
					cisException.getErrormessage(), null, null);
			response = Response
					.status(MessageConstants.RESPONSE_CODE_BAD_REQUEST_FUNCTIONAL)
					.entity(error).build();

		} else if (type == 2) {
			LOGGER.info(" Exception Raise for Type = 2 :");
			CISFunctionnalException cisException = (CISFunctionnalException) e;
			error = new com.sopra.steria.jpinternational.technicalservice.exception.Error(Integer.parseInt(cisException.getErrorkey()),
					cisException.getErrormessage(),
					cisException.getLocalizedMessage(), null);
			response = Response.status(Response.Status.BAD_REQUEST)
					.entity(error).build();

		} else if (type == 3) {
			DAOException errorException = (DAOException) e;
			error = new com.sopra.steria.jpinternational.technicalservice.exception.Error(4000, errorException.getMessage(), null, null);
			response = Response.status(Response.Status.EXPECTATION_FAILED)
					.entity(error).build();

		}

		return response;
	}
}

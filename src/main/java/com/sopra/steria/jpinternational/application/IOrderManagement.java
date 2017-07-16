package com.sopra.steria.jpinternational.application;

import com.sopra.steria.jpinternational.model.Orders;
import com.sopra.steria.jpinternational.model.ResponseMessage;
import com.sopra.steria.jpinternational.technicalservice.exception.CISFunctionnalException;
import com.sopra.steria.jpinternational.technicalservice.exception.CISTechnicalException;
import com.sopra.steria.jpinternational.technicalservice.exception.DAOException;

public interface IOrderManagement {

	public ResponseMessage ordersCreate(Orders orders)
			throws CISFunctionnalException, CISTechnicalException, DAOException;

}

package com.sopra.steria.jpinternational.business.validation;

import com.sopra.steria.jpinternational.technicalservice.exception.CISFunctionnalException;
import com.sopra.steria.jpinternational.technicalservice.exception.CISTechnicalException;

public interface IValidation {

	public Object validate(Object object) throws CISFunctionnalException,
			CISTechnicalException, NoSuchFieldException, IllegalAccessException;

}

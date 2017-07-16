package com.sopra.steria.jpinternational.technicalservice.exception;


public class CISFunctionnalException extends CISException {

    private static final long serialVersionUID = -3282034829196460017L;

    public CISFunctionnalException(String message, String errorCode) {
        super(message, errorCode);

    }
}
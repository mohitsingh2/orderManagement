package com.sopra.steria.jpinternational.technicalservice.exception;



public class CISException extends Exception {

	private final String errorkey;
    private final String errormessage;


    public CISException(String message, String errorCode) {
        super(message);
        this.errorkey = errorCode;
        this.errormessage = message;
    }

    public String getErrorkey() {
        return errorkey;
    }
    
    public String getErrormessage() {
        return errormessage;
    }

}
package com.sopra.steria.jpinternational.technicalservice.exception;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Error implements Serializable {

    private final Integer code ;
    private final String message ;
    private final String description ;
    private final String infoURL ;

    public Error(Integer code, String message, String description, String infoURL){
    	this.code = code;
    	this.message = message;
    	this.description = description;
    	this.infoURL = infoURL;
    }
    
    
	/**
     * An integer coding the error type. This is given to caller so he can
     * translate them if required.
     **/

    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }


    /**
     * A short localized string that describes the error.
     **/

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * (optional) A long localized error description if needed. It can contain
     * precise information about which parameter is missing, or what are the
     * identifier acceptable values.
     **/

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * (optional) A URL to online documentation that provides more information
     * about the error.
     **/

    @JsonProperty("infoURL")
    public String getInfoURL() {
        return infoURL;
    }


    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((infoURL == null) ? 0 : infoURL.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Error other = (Error) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (infoURL == null) {
			if (other.infoURL != null)
				return false;
		} else if (!infoURL.equals(other.infoURL))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		return true;
	}


	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Error {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    infoURL: ").append(toIndentedString(infoURL)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

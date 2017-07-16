package com.sopra.steria.jpinternational.model;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;



@Provider
public class JsonMappingExceptionMapper implements ExceptionMapper<JsonProcessingException> {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonMappingExceptionMapper.class);

    @Override
    public Response toResponse(JsonProcessingException e) {

        String relationShip = "productrelationship";
        String productType = "producttype";
        String status = "status";
        String message = " > sent in request is invalid";
        String priceType = "pricetype";
        String value = "";
        if (e.getMessage().toLowerCase().contains(relationShip) || e.getMessage().toLowerCase().contains(productType)
                || e.getMessage().toLowerCase().contains(status) || e.getMessage().toLowerCase().contains(priceType)) {
            try {
                String[] type = e.getMessage().split("'");
                value = type[1];
            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                // It is not handle "arrayIndexOutOfBoundsException" here
                LOGGER.error("Error occured while JsonProcessing of request :", arrayIndexOutOfBoundsException);
            }
        }

        if (value.isEmpty()) {
            value = e.getMessage();
        }

        return validateAllErrors(value, relationShip, message, productType, e, status, priceType);
    }

    private Response validateAllErrors(String value, String relationShip, String message, String productType,
            JsonProcessingException e, String status, String priceType) {

        Error error;

        if (checkContains(e.getMessage(), relationShip)) {
            error = new Error(/*4002, "System Bug : The relationship type <" + value + "> is not valid", null, null*/);
            return Response.status(Response.Status.BAD_REQUEST).entity(error).type(MediaType.APPLICATION_JSON).build();

        }

        else if (checkContains(e.getMessage(), productType)) {
            error = new Error(/*4024, "System Bug : ProductType <" + value + message, null, null*/);
            return Response.status(Response.Status.BAD_REQUEST).entity(error).type(MediaType.APPLICATION_JSON).build();

        }

        else if (checkContains(e.getMessage(), status)) {
            error = new Error(/*4025, "System Bug : Status <" + value + message, null, null*/);
            return Response.status(Response.Status.BAD_REQUEST).entity(error).type(MediaType.APPLICATION_JSON).build();

        } else if (checkContains(e.getMessage(), priceType)) {
            error = new Error(/*4062, "System Bug : PriceType <" + value + "> is not valid", null, null*/);
            return Response.status(Response.Status.BAD_REQUEST).entity(error).type(MediaType.APPLICATION_JSON).build();
        }

        else {
            error = new Error(/*400, e.getMessage(), null, null*/);
            return Response.status(Response.Status.BAD_REQUEST).entity(error).type(MediaType.APPLICATION_JSON).build();

        }
    }

    private boolean checkContains(String parent, String child) {
        return parent != null && parent.toLowerCase().contains(child);
    }
}

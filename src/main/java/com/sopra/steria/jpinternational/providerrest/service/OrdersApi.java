package com.sopra.steria.jpinternational.providerrest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.sopra.steria.jpinternational.model.Orders;

@Path("/")
public interface OrdersApi {

	@POST
	@Path("/v2/orders")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response orderCreate(Orders orderRequest);

}

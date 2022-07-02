package com.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloResources {

	@GET
	@Produces("text/plain")
	public String hello() {
		return "Hi Sivakumar!!!";
	}
}

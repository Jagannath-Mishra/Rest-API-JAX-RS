package com.concretepage.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/restwb") 
public class Calculation {
	@GET
	@Path("/add/{p1}/{p2}")
    @Produces("text/plain")
	public String add(@PathParam("p1") Integer param1, @PathParam("p2") Integer param2 ){
		 return String.valueOf(param1+param2);
	}

	@GET
	@Path("/sub/{p1}/{p2}")
	@Produces("application/json")
	public Response sub(@PathParam("p1") Integer param1, @PathParam("p2") Integer param2) {
		String result = null;
		if(param1 < param2)
		{
			result = "Please enter a bigger number in first variable";
			
		}else {
			result = String.valueOf(param1-param2);
		}
		
		
		return Response.status(200).entity(result).build();
	}
	
	
	@GET
	@Path("/mul/{p1}/{p2}")
	@Produces("application/html")
	public String mul(@PathParam("p1") Integer param1, @PathParam("p2") Integer param2 ) {
		
		
		return String.valueOf(param1*param2);
	}
	
}
 
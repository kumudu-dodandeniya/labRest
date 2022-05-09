package com;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.google.gson.*;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType; 


@Path("/Hello")
public class hello {

	@GET
	@Path("/") 
	@Produces(MediaType.TEXT_PLAIN) 
	public String hello() 
	 { 
	 return "Hello world."; 
	 } 
}

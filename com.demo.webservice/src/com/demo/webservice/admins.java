package com.demo.webservice;

import java.util.ArrayList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
 
@Path("/login")
public class admins {
	
  
class results{
	public String Message;
	public int ID;
	public  results(String Message,int ID){
		this.ID=ID;
		this.Message=Message;
	}
}
	public admins(){}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public results userlogin(@QueryParam("username") String username,@QueryParam("password") String password){
		results r;
		if(username.equals("admin")&& password.equals("admin"))
			 r=new results(" user is login",1);
			 
		 else
			 r=new results(" user is fail",2);
			 
			 
		return r;
	}
	/*
	@Path("/{id}/{name}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String userloginon(@PathParam("id") String id,@PathParam("name") String name){
		 
		return "params is:"+	id + "," + name;
	}
	*/
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN) 
	public String Data(){
		return "Datais posted";
	}
	
	@Path("/fail")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String userloginon(@QueryParam("id") String id,@QueryParam("name") String name){
		 
		return "params is:"+	id + "," + name;
	}
}

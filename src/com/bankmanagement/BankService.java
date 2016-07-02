package com.bankmanagement;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class BankService {
	
	BankDao bankDao = new BankDao();
	
	@GET
    @Path("/banks")
    @Produces(MediaType.APPLICATION_XML)
    public List<Bank> getBanks(){
       return bankDao.getAllBanks();
      
    }
	
	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_HTML)
	public String test() {
		
		return "<script>alert('test');</script>";
	}

}

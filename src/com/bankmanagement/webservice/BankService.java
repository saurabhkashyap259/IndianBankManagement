package com.bankmanagement.webservice;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.bankmanagement.dto.*;
import com.google.gson.Gson;
import com.bankmanagement.dao.*;

@Path("/")
public class BankService
{
	@GET
	@Path("/banks")
	@Produces("application/json")
	public String getBanks()
	{
		String banks = null;
		ArrayList<Bank> bankList = new ArrayList<Bank>();
		try
		{
			bankList = new AccessManager().getBanks();
			Gson gson = new Gson();
			banks = gson.toJson(bankList);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return banks;
	}
	
	@GET
	@Path("/branches")
	@Produces("application/json")
	public String getBranches()
	{
		String branches = null;
		ArrayList<Branch> branchList = new ArrayList<Branch>();
		try
		{
			branchList = new AccessManager().getBranches();
			Gson gson = new Gson();
			branches = gson.toJson(branchList);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return branches;
	}
	
   @GET
   @Path("/banks/{bankid}")
   @Produces("application/json")
   public String getBank(@PathParam("bankid") int bankID)
	{
	 
	   String bankString = null;
	   Bank bank = new Bank();
	   try
	   {
		   
		   bank = new AccessManager().getBank(bankID);
		   Gson gson = new Gson();
		   bankString = gson.toJson(bank);
	   }catch (Exception e) 
	   {
		   e.printStackTrace();
	   }
	   return bankString;
	}
   
   @GET
	@Path("/bank/branches/{bankid}")
	@Produces("application/json")
	public String getBranchesByBankID(@PathParam("bankid") int bankID)
	{
		String branches = null;
		ArrayList<Branch> branchList = new ArrayList<Branch>();
		try
		{
			branchList = new AccessManager().getBranchesByBankID(bankID);
			Gson gson = new Gson();
			branches = gson.toJson(branchList);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return branches;
	}
}

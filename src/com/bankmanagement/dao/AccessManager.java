package com.bankmanagement.dao;

import java.sql.Connection;
import java.util.ArrayList;

import com.bankmanagement.dto.*;

public class AccessManager
{
	public ArrayList<Bank> getBanks() throws Exception
	{
		ArrayList<Bank> bankList = new ArrayList<Bank>();
		DatabaseConnection db = new DatabaseConnection();
		Connection con = db.getConnection();
		Access access = new Access();
		bankList = access.getBanks(con);
		return bankList;
	}
	
	public ArrayList<Branch> getBranches() throws Exception
	{
		ArrayList<Branch> branchList = new ArrayList<Branch>();
		DatabaseConnection db = new DatabaseConnection();
		Connection con = db.getConnection();
		Access access = new Access();
		branchList = access.getBranches(con);
		return branchList;
	}
	
	public Bank getBank(long bankID) throws Exception{
		
		DatabaseConnection db = new DatabaseConnection();
		Connection con = db.getConnection();
		Access access = new Access();
        Bank bank = access.getBank(con, bankID);
        return bank;
   }
	
	public ArrayList<Branch> getBranchesByBankID(long bankID) throws Exception
	{
		ArrayList<Branch> branchList = new ArrayList<Branch>();
		DatabaseConnection db = new DatabaseConnection();
		Connection con = db.getConnection();
		Access access = new Access();
		branchList = access.getBranchesByBankID(con, bankID);
		return branchList;
	}
}


package com.bankmanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bankmanagement.dto.*;

public class Access
{
	public ArrayList<Bank> getBanks(Connection con) throws SQLException
	{
		ArrayList<Bank> bankList = new ArrayList<Bank>();
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM banks");
		ResultSet rs = stmt.executeQuery();
		try
		{
			while(rs.next())
			{
				Bank bank = new Bank();
				bank.setId(rs.getLong("id"));
				bank.setBank_name(rs.getString("name"));
				
				bankList.add(bank);
			}
		} catch (SQLException e)
		{
		e.printStackTrace();
		}
		return bankList;
		 
	}
	
	public ArrayList<Branch> getBranches(Connection con) throws SQLException
	{
		ArrayList<Branch> branchList = new ArrayList<Branch>();
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM branches");
		ResultSet rs = stmt.executeQuery();
		try
		{
			while(rs.next())
			{
				Branch branch = new Branch();
				branch.setIfsc(rs.getString("ifsc"));
				branch.setBank_id(rs.getLong("bank_id"));
				branch.setBranch(rs.getString("branch"));
				branch.setAddress(rs.getString("address"));
				branch.setCity(rs.getString("city"));
				branch.setDistrict(rs.getString("district"));
				branch.setState(rs.getString("state"));
				
				branchList.add(branch);
			}
		} catch (SQLException e)
		{
		e.printStackTrace();
		}
		return branchList;
		 
	}
	
	public Bank getBank(Connection con, long bankID) throws SQLException 
	{
	
		Bank bank = new Bank();
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM banks WHERE id = " + bankID);
		ResultSet rs = stmt.executeQuery();
		try
		{
			while(rs.next())
			{
				
				bank.setId(rs.getLong("id"));
				bank.setBank_name(rs.getString("name"));
			}
		}catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return bank;
	}
	
	public ArrayList<Branch> getBranchesByBankID(Connection con, long bankID) throws SQLException
	{
		ArrayList<Branch> branchList = new ArrayList<Branch>();
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM branches WHERE bank_id = " + bankID);
		ResultSet rs = stmt.executeQuery();
		try
		{
			while(rs.next())
			{
				Branch branch = new Branch();
				branch.setIfsc(rs.getString("ifsc"));
				branch.setBank_id(rs.getLong("bank_id"));
				branch.setBranch(rs.getString("branch"));
				branch.setAddress(rs.getString("address"));
				branch.setCity(rs.getString("city"));
				branch.setDistrict(rs.getString("district"));
				branch.setState(rs.getString("state"));
				
				branchList.add(branch);
			}
		} catch (SQLException e)
		{
		e.printStackTrace();
		}
		return branchList;
		 
	}
}

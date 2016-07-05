package com.bankmanagement.dto;

import java.io.Serializable;

public class Bank implements Serializable{
	
	private static final long serialVersionUID = 1L;
	long id;
	String bank_name;
	
	public Bank() {
		
	}

	public Bank(long id, String bank_name) {
		super();
		this.id = id;
		this.bank_name = bank_name;
	}

	public Bank(String bank_name) {
		super();
		this.bank_name = bank_name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	
	

}

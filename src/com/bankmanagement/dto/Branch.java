package com.bankmanagement.dto;

import java.io.Serializable;

public class Branch implements Serializable {
	
	String ifsc;
	long bank_id;
	String branch;
	String address;
	String city;
	String district;
	String state;
	
	public Branch() {
		
	}

	public Branch(String ifsc, long bank_id, String branch, String address, String city, String district,
			String state) {
		super();
		this.ifsc = ifsc;
		this.bank_id = bank_id;
		this.branch = branch;
		this.address = address;
		this.city = city;
		this.district = district;
		this.state = state;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public long getBank_id() {
		return bank_id;
	}

	public void setBank_id(long bank_id) {
		this.bank_id = bank_id;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}

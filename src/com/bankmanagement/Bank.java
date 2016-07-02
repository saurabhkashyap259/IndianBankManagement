package com.bankmanagement;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "banks")
public class Bank implements Serializable{
	
	private static final long serialVersionUID = 1L;
	long id;
	long bank_id;
	String bank_name;
	String branch;
	String city;
	String district;
	String state;
	String address;
	String ifsc;
	
	public Bank() {
		
	}

	public Bank(long id, long bank_id, String bank_name, String branch, String city, String district, String state,
			String address, String ifsc) {
		super();
		this.id = id;
		this.bank_id = bank_id;
		this.bank_name = bank_name;
		this.branch = branch;
		this.city = city;
		this.district = district;
		this.state = state;
		this.address = address;
		this.ifsc = ifsc;
	}

	public Bank(long bank_id, String bank_name, String branch, String city, String district, String state,
			String address, String ifsc) {
		super();
		this.bank_id = bank_id;
		this.bank_name = bank_name;
		this.branch = branch;
		this.city = city;
		this.district = district;
		this.state = state;
		this.address = address;
		this.ifsc = ifsc;
	}

	public long getId() {
		return id;
	}

	@XmlElement
	public void setId(long id) {
		this.id = id;
	}

	public long getBank_id() {
		return bank_id;
	}

	@XmlElement
	public void setBank_id(long bank_id) {
		this.bank_id = bank_id;
	}

	public String getBank_name() {
		return bank_name;
	}

	@XmlElement
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getBranch() {
		return branch;
	}

	@XmlElement
	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCity() {
		return city;
	}

	@XmlElement
	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	@XmlElement
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	@XmlElement
	public void setState(String state) {
		this.state = state;
	}

	public String getAddress() {
		return address;
	}

	@XmlElement
	public void setAddress(String address) {
		this.address = address;
	}

	public String getIfsc() {
		return ifsc;
	}

	@XmlElement
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	
	

}

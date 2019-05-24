package com.cts.model;

public class Customer {
	private String fname;
	private String mobno;
	private String address;
	private String gender;
	private String email;
	private String pass;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public Customer(String fname, String mobno, String address, String gender, String email, String pass)
	{
		super();
		this.fname = fname;
		this.mobno = mobno;
		this.address = address;
		this.gender = gender;
		this.email = email;
		this.pass = pass;
	}
	
	
	
	
}

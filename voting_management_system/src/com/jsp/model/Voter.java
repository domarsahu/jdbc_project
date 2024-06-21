package com.jsp.model;

import java.io.Serializable;

public class Voter  implements Serializable{
	
	private String name;
	private String email;
	private long phone;
	private int age;
	private String nationality;
	private String address;
	
	
	public Voter(String name, String email, long phone, int age, String nationality, String address) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.nationality = nationality;
		this.address = address;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}

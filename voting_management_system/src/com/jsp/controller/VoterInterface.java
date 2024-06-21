package com.jsp.controller;

import com.jsp.model.Voter;

public interface VoterInterface {
	
	public  Voter insertData(String name, String email, long phone, int age, String nationality, String address) ;
		
	public Voter deleteData(String email);
	
	public Voter updateData(String email, long phone, String nname, String nemail, long nphone, int nage, String naddress);

	public Voter displayData(String email, long phone);
}

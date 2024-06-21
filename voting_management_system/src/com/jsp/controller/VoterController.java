package com.jsp.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.model.Voter;

public class VoterController implements VoterInterface {
	static Connection connection = JdbcConnection.createConnection();


	public  Voter insertData(String name, String email, long phone, int age, String nationality, String address) {
		
		try {
				PreparedStatement ps= connection.prepareStatement
						("insert into voter(name, email, phone, age, nationality, address) values(?,?,?,?,?,?)");
				
				ps.setString(1, name);
				ps.setString(2, email);
				ps.setLong(3, phone);
				ps.setInt(4, age);
				ps.setString(5,nationality);
				ps.setString(6, address);
				
				ps.execute();
				
				connection.close();
				
				System.out.println("Data inserted");
			
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;
	
	}
	
	
	//delete the data
	
	public Voter deleteData(String email) {
			
			try {
				PreparedStatement ps1= connection.prepareStatement("delete from voter where email=?");
				ps1.setString(1, email);
				
				ps1.execute();
				
				//connection.close();
				System.out.println("date is Deleted");
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return null;
			
		}
	
	//update the data
	
	public Voter updateData(String email, long phone, String nname, String nemail, long nphone, int nage, String naddress) {
		
		try {
			PreparedStatement ps3= connection.prepareStatement
					("update voter set name=?,email=?, phone=?, age=?, address=? where email=? and phone=?");
			ps3.setString(1, nname);
			ps3.setString(2, nemail);
			ps3.setLong(3, nphone);
			ps3.setInt(4, nage);
			ps3.setString(5, naddress);
			
			ps3.setString(6, email);
			ps3.setLong(7, phone);
			
			ps3.executeUpdate();
			
		//	connection.close();
			System.out.println("data is updated");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return null;
		
	}

	// display the data 
	
	public Voter displayData(String email, long phone) {
		
		try {
			PreparedStatement ps4= connection.prepareStatement
					("select * from voter where email=? and phone=?");
			
			ps4.setString(1, email);
			ps4.setLong(2, phone);
			
			ResultSet rs = ps4.executeQuery();
			
			while(rs.next()) {
				System.out.println();
				System.out.println("Name : "+rs.getString(1));
				System.out.println("Email Id : "+rs.getString(2));
				System.out.println("Phone Number : "+rs.getString(3));
				System.out.println("Age : "+rs.getInt(4));
				System.out.println("Nationality : "+rs.getString(5));
				System.out.println("Address : "+rs.getString(6));
				
			}
			
			connection.close();
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}	
	
	
}

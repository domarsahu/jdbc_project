package com.jsp.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	
	public static Connection createConnection() {

		String url = "jdbc:postgresql://localhost:5432/jdbc2";
		String user = "postgres";
		String password = "root";
		try {
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection(url, user, password);
			
			
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}
	
	

}

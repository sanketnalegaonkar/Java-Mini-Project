package com.tq.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//This class is configured for DB Connection
public class DBConnection {

	static final String driver = "com.mysql.jdbc.Driver";
	static final String url = "jdbc:mysql://localhost:3306/tq_training_academy";
	static final String user = "root";
	static final String password = "home1112";

	public static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		finally
		{
			
			
		}
	   return con;
	   
	} 
	
}

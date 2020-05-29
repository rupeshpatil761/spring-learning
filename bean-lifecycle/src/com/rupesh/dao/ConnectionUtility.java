package com.rupesh.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtility {
	
	/**
	 * We can read below values from properties file.
	 */
	//private static String driver = "";
	private static String url = "jdbc:postgresql://localhost/dvdrental";
	private static String username = "postgres";
	private static String password = "postgres";
	
	private static Connection con = null;

	private ConnectionUtility() {
		// TODO Auto-generated constructor stub
	}
	
	public static Connection getConnection() {
		if(con==null) {
			try {
				//load driver
				// register JDBC driver, optional, since java 1.6
				//Class.forName(driver);
				//get a connection
				con = DriverManager.getConnection(url,username,password);
			} catch (SQLException e) {
				System.out.println("excetion during database connection");
				e.printStackTrace();
			}
		}
		return con;
	}
}

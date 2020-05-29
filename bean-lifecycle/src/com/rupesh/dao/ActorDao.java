package com.rupesh.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("actor")
public class ActorDao {
	
	Connection con;
	
	@PostConstruct
	public void init() {
		System.out.println("init method called");
		getDbConnection();
	}
	
	public void getDbConnection() {
		System.out.println("getDbConnection method called");
		con = ConnectionUtility.getConnection();
	}
	
	public void fetchFirst10Actors() throws SQLException {
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from actor limit 10");
		while(rs.next()) {
			int id = rs.getInt(1);
			String firstName = rs.getString(2);
			String lastName = rs.getString(3);
			System.out.println(id+"==="+firstName+"==="+lastName);
		}
	}
	
	@PreDestroy
	public void destroy() throws SQLException {
		System.out.println("destroy method called");
		closeConnection();
	}
	
	public void closeConnection() throws SQLException {
		System.out.println("closeConnection method called");
		con.close();
	}
}

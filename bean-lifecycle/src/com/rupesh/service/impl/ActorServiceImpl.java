package com.rupesh.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.rupesh.dao.ActorDao;


public class ActorServiceImpl {
	
	public void printActorDetails() throws SQLException {
		
		/*ActorDao dao = new ActorDao();
		ResultSet rs = dao.fetchFirst10Actors();
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String firstName = rs.getString(2);
			String lastName = rs.getString(3);
			System.out.println(id+"==="+firstName+"==="+lastName);
		}*/
	}
}

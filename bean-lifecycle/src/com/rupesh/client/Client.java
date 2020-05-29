package com.rupesh.client;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rupesh.dao.ActorDao;
import com.rupesh.dao.TestDao;

public class Client {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ClientConfig.class); 
		ActorDao actorService = context.getBean("actor",ActorDao.class);
		TestDao testDao  = context.getBean("test", TestDao.class);
		try {
			actorService.fetchFirst10Actors();
			testDao.callMethod1();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		context.close();
	}

}

package com.rupesh.di.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileUser {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		AirtelProvider airtel = context.getBean("airtel", AirtelProvider.class);
		airtel.activateService();
	}
}

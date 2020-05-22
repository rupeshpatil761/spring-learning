package com.rupesh.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		/**
		 * Approach 1: Direct create the object of implementation class
		 *  
		 */
		/*Airtel airtel = new Airtel();
		airtel.calling();
		airtel.data();*/
		/**
		 * Approach 2: Use the interface reference to hold the object of implementation class
		 * This is nothing but runtime polymorphism.
		 */
		/*Sim sim = new Airtel();
		sim.calling();
		sim.data();*/
		
		/**
		 * Challenges in above approches 
		 * 1) If new sim came in market or want to change the operator, 
		 * need to do code changes on source code.
		 * 2) Application is not configurable
		 * 
		 *  Solution:
		 *  1) Make the app configurable using IoC
		 *  
		 *  Why & How?
		 *  1) As a developer, we must focus on business logic.
		 *  2) Spring framework provides the container, 
		 *  which will creates and manages the objects for us
		 *  3) The objects created by container called as beans.
		 *  4) Container nothing but an interface either BeanFactory or ApplicationContext 
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("context loaded");
		// Sim sim = (Sim) context.getBean("sim");
		/**
		 * Avoid above type casting
		 */
		Sim sim = context.getBean("sim", Sim.class);
		sim.calling();
		sim.data();
	}

}

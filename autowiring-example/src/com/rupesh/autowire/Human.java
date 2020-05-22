package com.rupesh.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired  // this is will work without @Qualifier because bean id and variable name are matched else NoUniqueBeanDefinitionException
	@Qualifier("heart1")
	private Heart heart;
	
	/**
	 * we can remove constructors and setter methods if we are using @Autowired before/on dependency
	 */
	
	//public Human() {}
	
	/*public Human(Heart heart) {
		super();
		this.heart = heart;
		System.out.println("Human constructor get called");
	}
	
	// Will get called in case of byName and byType autowiring
	public void setHeart(Heart heart) {
		System.out.println("setHeart method called");
		this.heart = heart;
	}*/

	public void startPumping() {
		if(heart!=null) {
			heart.pump();
		} else {
			System.out.println("You are dead");
		}
	}
}

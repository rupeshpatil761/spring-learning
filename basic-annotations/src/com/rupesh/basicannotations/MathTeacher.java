package com.rupesh.basicannotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MathTeacher implements Teacher {

	@Override
	public void teaching() {
		System.out.println("I am math teacher");

	}

}

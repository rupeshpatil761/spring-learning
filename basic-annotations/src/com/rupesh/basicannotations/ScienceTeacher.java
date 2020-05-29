package com.rupesh.basicannotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

	@Override
	public void teaching() {
		System.out.println("I am Science teacher");

	}

}

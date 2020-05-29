package com.rupesh.properties;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("11")
	private String id;
	
	@Value("Rupesh")
	//@Required // The annotation @Required is disallowed for this location
	private String name;
	private String city;
	private String mobile;
/*
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}*/

	void printStudentInfo() {
		System.out.println(this.id + "---"+ this.name + "---"+ this.city + "---"+ this.mobile);
	}
}

package com.rupesh.di;

public class Student {

	private int id;
	private String name;
	
	public String getName() {
		return name;
	}
	
	// Setter injection for property name
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	// Setter injection for property id
	public void setId(int id) {
		this.id = id;
	}
	
	// we must have default constructor else BeanInstantiationException
	public Student() {}
	
	public Student(int id) {
		this.id = id;
	}
}

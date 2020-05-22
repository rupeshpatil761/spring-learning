package com.rupesh.di;

public class Student1 {

	private int id;
	private String name;
	
	// not mandatory
	public Student1() {}
	
	public Student1(int id) {
		this.id = id;
	}
	
	public Student1(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void displayStudentInfo() {
		System.out.println(this.id +"======"+this.name);
	}
}

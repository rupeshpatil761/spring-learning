package com.rupesh.di;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		// Get and configure the student bean using setter injection. 
		Student student = context.getBean("student",Student.class);
		System.out.println(student.getName() +" === "+ student.getId());
		
		// Get and configure the student bean using setter injection. 
		Student1 student1 = context.getBean("student1",Student1.class);
		student1.displayStudentInfo();
	}
}

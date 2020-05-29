package com.rupesh.basicannotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.rupesh.basicannotations")
public class CollegeConfig {
	
	//In this case, we dont need the @ComponentScan
	/*@Bean
	public Department departmentBean() {
		return new Department();
	}*/
	
	/*@Bean
	public static Department departmentBeanStatic() {
		return new Department();
	}*/
	
	/*@Bean
	public Teacher teacherBean() {
		return new MathTeacher();
	}*/
	
	/*@Bean
	public College collegeBean() {
		College college = new College();
		//College college = new College(departmentBean()); //constructor injection
		college.setDept(departmentBean());
		college.setTeacher(teacherBean());
		return college;
	}*/

}

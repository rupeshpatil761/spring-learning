package com.rupesh.basicannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	@Autowired
	private Department dept;
	
	@Autowired
	//@Qualifier("scienceTeacher") // if we comment this, the @Primary annotated bean gets injected
	private Teacher teacher;
	
	/*public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	public College() {}

	public College(Department dept) {
		super();
		this.dept = dept;
	}*/

	public void printDeptAndTeacherName() {
		dept.deptName();
		teacher.teaching();
	}
}

package com.rupesh.reference;

public class Student1 {
	/**
	 * Here we are going to take simple example.
	 * Student's want to do cheating in Math exam
	 */
	private int id;
	
	//reference injection
	private MathCheat mathCheat;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public MathCheat getMathCheat() {
		return mathCheat;
	}
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}
	
	public Student1(int id) {
		this.id = id;
	}
	
	//this method is dependent on mathCheat
	public void startCheating() {
		mathCheat.startCheating();
		System.out.println("For student1 with id: "+this.getId());
	}
}

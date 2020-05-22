package com.rupesh.reference;

public class Student2 {
	
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
	
	//this method is dependent on mathCheat
	public void startCheating() {
		mathCheat.startCheating();
		System.out.println("For student2 with id: "+this.getId());
	}
}

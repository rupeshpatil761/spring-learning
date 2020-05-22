package com.rupesh.ioc;

public class Airtel implements Sim {
	
	public Airtel() {
		System.out.println("Airtel class instantiated");
	}

	@Override
	public void calling() {
		System.out.println("Calling via Airtel sim");
	}

	@Override
	public void data() {
		System.out.println("Browsing via Airtel sim");
	}
}

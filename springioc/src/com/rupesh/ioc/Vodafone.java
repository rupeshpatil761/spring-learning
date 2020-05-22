package com.rupesh.ioc;

public class Vodafone implements Sim {

	public Vodafone() {
		System.out.println("Vodafone class instantiated");
	}
	
	@Override
	public void calling() {
		System.out.println("Calling via Vodafone sim");
	}

	@Override
	public void data() {
		System.out.println("Browsing via Vodafone sim");
	}
}

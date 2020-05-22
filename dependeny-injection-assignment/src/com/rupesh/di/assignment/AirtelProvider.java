package com.rupesh.di.assignment;

public class AirtelProvider {

	private Service service;
	
	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}
	
	public AirtelProvider() {}

	public AirtelProvider(Service service) {
		super();
		this.service = service;
	}
	
	public void activateService() {
		service.service();
	}

}

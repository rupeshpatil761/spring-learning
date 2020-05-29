package com.rupesh.dao;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component("test")
public class TestDao implements InitializingBean, DisposableBean {

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean destroy method");
	}
	
	public void callMethod1() {
		System.out.println("===========method1==============");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean afterPropertiesSet method");
	}

}

package com.ssi.autowire;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Moniter implements InitializingBean,DisposableBean {

	public Moniter() {
		super();
		System.out.println("Creating obj from Monitor");
	}

	@PreDestroy
	public void destroy() throws Exception {
		
		System.out.println("Destroying after context"
				+ " close");
	}

	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Post construct after"
				+ " Monitor object creation");
	}

	
}

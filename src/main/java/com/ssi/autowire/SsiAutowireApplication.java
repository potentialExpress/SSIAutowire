package com.ssi.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SsiAutowireApplication {

	public static void main(String[] args) {
		System.out.println("Hello Spring...");
		
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("beans.xml");
		Laptop laptop = context.getBean("laptop", Laptop.class);
		laptop.displayInfo();
		
		
	}

}

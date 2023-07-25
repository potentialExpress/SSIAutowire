package com.ssi.autowire;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SsiAutowireApplication {

	public static void main(String[] args) {
		System.out.println("Hello Spring...");

		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Laptop laptop = context.getBean("laptop", Laptop.class);
		Laptop laptop1 = context.getBean("laptop", Laptop.class);
		if (laptop.hashCode() == laptop1.hashCode()) {
			System.out.println("****Singelton*****");
			System.out.println("laptop.hashCode()--"+laptop.hashCode());
			System.out.println("laptop1.hashCode()--"+laptop1.hashCode());
		} else {
			System.out.println("***not Singleton");
			System.out.println("laptop.hashCode()--"+laptop.hashCode());
			System.out.println("laptop1.hashCode()--"+laptop1.hashCode());
		}

		laptop.displayInfo();
		context.close();

	}

}

package com.ssi.autowire;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
//@Scope("prototype")
public class Laptop implements InitializingBean,DisposableBean{
	
	@Autowired
	HardDisk hardDisk ;
	
	public void displayInfo() {
		// TODO Auto-generated method stub
		
		System.out.println("The type of hadDisk is..."+hardDisk.getType());
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("laptop destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("laptop post ");
	}
}

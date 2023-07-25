package com.ssi.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Laptop {
	
	@Autowired
	HardDisk hardDisk ;
	
	public void displayInfo() {
		// TODO Auto-generated method stub
		
		System.out.println("The type of hadDisk is..."+hardDisk.getType());
	}
}

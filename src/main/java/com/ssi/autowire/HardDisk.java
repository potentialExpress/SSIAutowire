package com.ssi.autowire;

import org.springframework.beans.factory.annotation.Value;

public class HardDisk {

	@Value("${type}")
	String type;

	public String getType() {
		return type;
	}

	
}

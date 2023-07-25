package com.ssi.autowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.ssi.autowire")
@PropertySource("classpath:application.properties")
public class Config {

@Bean
public Moniter getMoniterBean() {
	return new Moniter();
}

}

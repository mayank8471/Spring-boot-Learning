package com.mayank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = { "com.mayank", "in.mayank"})
public class SpringComponentScanApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringComponentScanApplication.class, args);
		
		System.out.println(context.getBeanDefinitionCount());
	}
	
	

}

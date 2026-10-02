package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SentEmail implements CommandLineRunner{

	@Override
	public void run(String...strings  ) throws Exception {
		System.out.println("Email sending.....");
	}
}

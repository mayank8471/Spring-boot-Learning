package com.mayank.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Security {
		public Security() {
			System.out.println("Custom Security :: contructor");
		}

    @Bean
    Security createInstance() { 
			Security as = new Security();
			// custom logic
			return as;
		}
		
}

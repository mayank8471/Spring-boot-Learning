package com.mayank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mayank.models.User;
import com.mayank.repository.UserRepository;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpa1Application.class, args);
		UserRepository repository = context.getBean(UserRepository.class);

		User u1 = new User(106, "Will Smith", "Male", 26, "Africa");
		User u2 = new User(107, "Michal B. Jordan", "Male", 25, "Africa");
//        User u2 = new User();
//        u2.setAge(23);
//        u2.setCountry("India");;
//        u2.setUserId(102);
//        u2.setGender("Male");
//        u2.setUserName("Priyanshu");
//        
		//repository.save(u1);
		//repository.save(u2); 
		
		//  List<User> res = repository.findByCountry("usa");
		
		//  List<User> res = repository.findByAgeGreaterThanEqual(25);
		String[] str = {"usa", "India"};
		
		  List<User> res = repository.getAllUsersByCountryHQL("india");
		res.forEach(user ->{
			System.out.println(user);
		});
		
	}

}
 
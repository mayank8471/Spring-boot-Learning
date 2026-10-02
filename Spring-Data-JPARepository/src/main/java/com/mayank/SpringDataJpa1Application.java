package com.mayank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.mayank.models.User;
import com.mayank.repository.UserRepository;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpa1Application.class, args);
		UserRepository repository = context.getBean(UserRepository.class);
//	   
//		User u1 = new User(108,"Sujeet", "Male",24,"India" );
//		User u2 = new User(109,"Harry", "Male",24,"USA" );
//		User u3 = new User(110,"Peter", "Male",24,"USA" );
//		User u4 = new User(111,"Tom", "Male",24,"England" );
//		User u5 = new User(112,"Pankaj", "Male",24,"India" );
//		
//		repository.saveAll(Arrays.asList(u1,u2,u3,u4,u5));
//		
//		 List<User> user =  (List<User>) repository.findAll();
//	   System.out.println("***********************************************************");
//		 user.forEach(u ->{
//			 System.out.println(u);
//		 });
//		
//		 List<User> user =  (List<User>) repository.findAll(Sort.by("userName"));
	//	PageRequest pgr = PageRequest.of(0, 3);
	//	Page<User> pageData = repository.findAll(pgr);
		// List<User> user = pageData.getContent();

//		 int totalPage = pageData.getTotalPages();
//		
//		 System.out.println(totalPage);
//		   System.out.println("***********************************************************");
//		   
//			 user.forEach(u ->{
//				 System.out.println(u);
//			 });
//		
		User entity = new User();
				entity.setCountry("India");
				
		Example<User> example = Example.of(entity);

		System.out.println("***********************************************************");
		List<User> user = repository.findAll(example,Sort.by("userName"));
		user.forEach(u -> {
			System.out.println(u);
		});

	}

}

package com.mayank;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mayank.models.Player;
import com.mayank.repository.PlayerRepository;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

		 PlayerRepository playerRepository = context.getBean(PlayerRepository.class);
		 
		 // System.out.println(playerRepository.getClass().getName());
		 
		 Player p1 = new Player();
		 p1.setID(1);
		 p1.setPlayerName("Mayank");;
		 p1.setPlayerAge(24);
		 p1.setLocation("Prayagraj");
		 
		 playerRepository.save(p1);
				 
	}

}

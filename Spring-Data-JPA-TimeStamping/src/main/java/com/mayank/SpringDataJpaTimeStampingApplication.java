package com.mayank;
import com.mayank.model.Product;
import com.mayank.repo.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class SpringDataJpaTimeStampingApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaTimeStampingApplication.class, args);
		
		ProductRepository repository = context.getBean(ProductRepository.class);
		
		Product p1 = new Product();
		p1.setPid(102);
		p1.setPname("KeyBoard");
		//p1.setPrice(536.70);
		
		repository.save(p1);

	}

}

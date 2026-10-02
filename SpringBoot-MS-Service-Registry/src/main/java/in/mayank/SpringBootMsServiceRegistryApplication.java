package in.mayank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootMsServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsServiceRegistryApplication.class, args);
	}

}

package in.mayank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMsWelcomApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsWelcomApiApplication.class, args);
	}

}

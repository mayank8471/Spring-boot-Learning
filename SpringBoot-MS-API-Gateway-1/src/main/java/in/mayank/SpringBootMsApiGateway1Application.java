package in.mayank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMsApiGateway1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsApiGateway1Application.class, args);
	}

}

package in.mayank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class SpringBootMsAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsAdminServerApplication.class, args);
	}

}

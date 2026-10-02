package in.mayank;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class SpringBootSecurity02ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurity02ConsumerApplication.class, args);
		String apiUrl = "http://localhost:8080/welcome";
		RestTemplate rt = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
	//	System.out.println(he));
		headers.setBasicAuth("mayank", "mayank123");
		HttpEntity<Void> entity = new HttpEntity<>(headers);
		
		ResponseEntity<String> exchange = rt.exchange(apiUrl, HttpMethod.GET, entity, String.class);
		
		System.out.println(exchange.getBody());
	}

}

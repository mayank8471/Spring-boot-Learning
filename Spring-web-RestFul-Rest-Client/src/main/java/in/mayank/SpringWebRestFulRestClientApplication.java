package in.mayank;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringWebRestFulRestClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebRestFulRestClientApplication.class, args);
		
		String apiURL = "http://3.24.123.176:8080/";
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<String> forEntity = rt.getForEntity(apiURL, String.class);
		
		
		String st = forEntity.getBody();
		System.out.println(st);
	}

}

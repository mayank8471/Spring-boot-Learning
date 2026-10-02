package in.mayank;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootSecurity01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurity01Application.class, args);

		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		//headers.setBearerAuth("your-token");
		headers.setBasicAuth("mayank", "mayank123");
		//headers.setContentType(MediaType.APPLICATION_JSON);
		//headers.set("Authorization", "Basic "+ Base64.getEncoder().encodeToString("mayank","mayank123"));
		HttpEntity<Void> entity = new HttpEntity<>(headers);

		ResponseEntity<String> response = restTemplate.exchange("http://localhost:8080/msg", HttpMethod.GET, entity,
				String.class);
		System.out.println(response.getBody());
	}
}
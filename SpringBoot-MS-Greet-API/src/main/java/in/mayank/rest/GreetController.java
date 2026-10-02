package in.mayank.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.mayank.client.WelcomeAPIClient;

@RestController
public class GreetController {

	@Autowired
	private WelcomeAPIClient client;
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		String welcomeMsg = client.invokeWelcomeApi();
		
		return welcomeMsg + ", Hello Mayank";
	}
}

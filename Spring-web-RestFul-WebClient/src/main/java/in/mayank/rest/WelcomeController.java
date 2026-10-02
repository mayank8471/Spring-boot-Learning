package in.mayank.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.mayank.properties.ApplicationProperties;

@RestController
public class WelcomeController {

	@Autowired
	private ApplicationProperties props;
	
	@GetMapping("/welcome")
	public String getWelcomeMSG() {
		return props.getMessages().get("WelcomeMSG");
	}
	
	@GetMapping("/greet")
	public String getGreetMSG() {
		return props.getMessages().get("greetMSG");
	}
}

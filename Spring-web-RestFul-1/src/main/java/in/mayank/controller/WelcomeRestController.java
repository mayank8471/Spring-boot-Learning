package in.mayank.controller;

import java.net.http.HttpClient;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg(){
		
		String resPayload = "welcome to Mayank site";
		
		return new ResponseEntity<>(resPayload, HttpStatus.OK );
	}
	
	@GetMapping("/welcome-api")
	public String getGreet() {
		return "Hello and Welcome!!....";
	}
	
}

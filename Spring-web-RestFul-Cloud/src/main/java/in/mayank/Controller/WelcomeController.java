package in.mayank.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/")
	public ResponseEntity<String> greetMsg(){
		return new ResponseEntity<>("Welcome Mayank ",HttpStatus.OK);
	}
	
}

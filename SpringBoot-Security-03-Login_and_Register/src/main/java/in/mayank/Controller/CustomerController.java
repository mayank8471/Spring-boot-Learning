package in.mayank.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.mayank.Entity.Customer;
import in.mayank.service.CustomerService;
import in.mayank.service.JwtService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;



	@Autowired
	private JwtService jwtService;

	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody Customer c) {

		boolean status = service.register(c);
		if (status) {
			return new ResponseEntity<String>("Success", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Failure", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome";
	}

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody Customer c) {

		String token = service.login(c);
		if (token != null) {
			
			return new ResponseEntity<String>(token, HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Failure", HttpStatus.BAD_REQUEST);
		}
	}

}










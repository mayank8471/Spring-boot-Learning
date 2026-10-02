package in.mayank.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/msg")
	public String msg() {
		return "Hello";
	}

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome";
	}

	@GetMapping("/greet")
	public String greet() {
		return "Hello !!!!!";
	}
}

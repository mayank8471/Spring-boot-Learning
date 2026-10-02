package in.mayank.Controller;

import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.mayank.bindings.Passenger;

@RestController
@RequestMapping("/book")
public class PassengerController {

	Passenger p1 = new Passenger();

	@GetMapping(value = "/details", 
			produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Passenger> getPassenger() {
		return new ResponseEntity<>(p1, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<Passenger> generatePid(@RequestBody Passenger p) {

		Random rand = new Random();
		Long id = rand.nextLong(100000 * 10000);
		p.setPId(id);
		p1 = p;
		return new ResponseEntity<>(p1, HttpStatus.OK);

	}

}

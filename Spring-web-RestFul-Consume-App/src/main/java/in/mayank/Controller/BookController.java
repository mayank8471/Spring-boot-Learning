package in.mayank.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.mayank.bindings.Book;

@RestController
public class BookController {

	@PostMapping(value = "/book", consumes  = { "application/json", "application/xml" })
	public ResponseEntity<Book> addBook(@RequestBody Book book) {

		System.out.println(book);
		return new ResponseEntity<>(book,HttpStatus.CREATED);
	}
}

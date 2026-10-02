package in.mayank.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.mayank.bindings.Book;

@RestController
public class BookController {

	@GetMapping("/book/{name}")
	public ResponseEntity<String> getBookPrice(@PathVariable("name") String name) {
		String resBody = name + " Book price Is 400";
		return new ResponseEntity<>(resBody, HttpStatus.OK);
	}

	@GetMapping("/book/{bname}/{aname}")
	public ResponseEntity<String> getBook(@PathVariable String bname, @PathVariable String aname) {
		return new ResponseEntity<>("Book Name: " + bname + "<br> Author Name : " + aname, HttpStatus.OK);
	}

	@GetMapping(value = "/books", produces = {"application/xml" ,"application/json"} )
	public ResponseEntity<List<Book>> getBooks(){
    	Book b1 = new Book(101,"Spring", "Mayank");
    	Book b2 = new Book(102,"C", "Denis Richie");
    	
    	return new ResponseEntity<>(Arrays.asList(b1,b2) , HttpStatus.OK );
    	
    }
}

package in.mayank.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@GetMapping("/course")
	public ResponseEntity<String> getCourseName(@RequestParam String cname){
		
		return new ResponseEntity<>("Course Name: "+ Character.toUpperCase(cname.charAt(0)) + cname.substring(1) , HttpStatus.OK);
	}
	
	@GetMapping("/course-details")
	public ResponseEntity<String> getCourseDetails(@RequestParam String cname, @RequestParam Integer cprice ){
		
		return new ResponseEntity<>("Course Name: "+ 
				Character.toUpperCase(cname.charAt(0)) + 
				cname.substring(1)+
				 "<br>" +"Course Price : " + cprice
				, HttpStatus.OK);
	}
}

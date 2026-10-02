package com.education.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.education.model.Course;
import com.education.model.Student;
import com.education.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping
	public List<Student> getAllStudents() {
		return service.getAllStudents();
	}

	@PostMapping
	public Student addStudent(@RequestBody  Student s) {
		return service.addStudent(s);
	}

	 @PutMapping("/{id}/course")
	public Student assignCourse(@PathVariable Integer id, @RequestParam String course) {
		return service.assignCourse(id, course);
	}
	
}

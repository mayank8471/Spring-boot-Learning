package com.education.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.education.model.Student;

@Service
public class StudentService {

	private List<Student> students = new ArrayList<>();
	
	public List<Student> getAllStudents(){
		return students;
	}
	
	public Student addStudent(Student s) {
		students.add(s);
		return s;
	}
	
	  public Student assignCourse(Integer id, String course) {
	        for (Student s : students) {
	            if (s.getStudentId() == id) {
	                s.getCourse().add(course);
	                return s;
	            }
	        }
	        return null;
	    }
	
}

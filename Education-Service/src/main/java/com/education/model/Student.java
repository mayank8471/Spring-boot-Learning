package com.education.model;

import java.util.List;

import lombok.Data;

@Data
public class Student {
	
	private Integer studentId;
	
	private String studentName;
	
	private List<String> course;
}

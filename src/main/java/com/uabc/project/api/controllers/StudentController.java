package com.uabc.project.api.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uabc.project.api.entities.Student;

@RestController 
public class StudentController {
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return Arrays.asList(new Student(1L,"Jose", "Perez", "Lopez", 19));
	}

}

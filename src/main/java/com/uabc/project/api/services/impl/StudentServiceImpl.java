package com.uabc.project.api.services.impl;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.uabc.project.api.entities.Student;
import com.uabc.project.api.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	public Student saveStudent(Student student) {
		//TODO this is a test method just adding a mock number
		return student.setId(new Random().nextLong());
	}
}

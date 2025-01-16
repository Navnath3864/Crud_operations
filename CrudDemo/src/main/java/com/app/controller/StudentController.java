package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.service.StudentService;
@RestController
public class StudentController {
	@Autowired
	StudentService ss;
	@PostMapping("/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student s) {
		Student stud= ss.addStudent(s);
		return new ResponseEntity<Student>(stud,HttpStatus.ACCEPTED);
		
	}
public void m1()
{
}
}


package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		Student stud = ss.addStudent(s);
		return new ResponseEntity<Student>(stud, HttpStatus.ACCEPTED);

	}

	@GetMapping("/getsingle/{rollno}")
	public ResponseEntity<Student> getSingleStudent(@PathVariable("rollno") int rollno) {
		Student stud = ss.getSingleStudent(rollno);
		return new ResponseEntity<Student>(stud, HttpStatus.OK);
	}

	@GetMapping("/getall")
	public ResponseEntity<List<Student>> getAllStudent() {
		List<Student> studList=ss.getAllStudent();
		return new ResponseEntity<List<Student>>(studList,HttpStatus.OK);
	}
	public void m2()
	{
		System.out.println("M2 method...");
	}

}

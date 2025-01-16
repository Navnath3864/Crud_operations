package com.app.controller;

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
		Student stud= ss.addStudent(s);
		return new ResponseEntity<Student>(stud,HttpStatus.ACCEPTED);
		
	}
<<<<<<< HEAD
	
	@GetMapping("/getsingle/{rollno}")
	public ResponseEntity<Student> getSingleStudent(@PathVariable("rollno") int rollno) {
		Student stud= ss.getSingleStudent(rollno);
		return new ResponseEntity<Student>(stud,HttpStatus.OK);
	}
	
	public void m1()
	{
		
	}
=======
public void m1()
{
>>>>>>> branch 'master' of https://github.com/Navnath3864/Crud_operations.git
}
}


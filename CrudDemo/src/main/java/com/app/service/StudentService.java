package com.app.service;

import java.util.List;

import com.app.model.Student;

public interface StudentService {

	public Student addStudent(Student s);

	public Student getSingleStudent(int rollno);

	public List<Student> getAllStudent();

}

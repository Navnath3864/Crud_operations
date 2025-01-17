package com.app.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Student;
import com.app.repository.StudentRepository;
import com.app.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository repo;
	
	@Override
	public Student addStudent(Student s) {
		return repo.save(s);
	}

	@Override
	public Student getSingleStudent(int rollno) {
		Optional<Student> op=repo.findById(rollno);
		if(op.isPresent())
		{
			Student st=op.get();
			return st;
					
		}
		return null;
	}

	@Override
	public List<Student> getAllStudent() {
		return repo.findAll();
	}
	
	
}

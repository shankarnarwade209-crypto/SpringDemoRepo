package com.example.demo.Studentservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.StudentRepo.StudentRepo;
import com.example.demo.module.Student;
@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	public void saveStudent() {
		Student student = new Student();
		
		student.setS_Id(101);
		student.setS_FirstName("MaheshBhai");
		student.setS_LastName("DiwanSahab");
		studentRepo.save(student);
		
	}
	
	
	
}

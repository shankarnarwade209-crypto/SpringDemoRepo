package com.example.demo.StudentRepo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.module.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
	
}

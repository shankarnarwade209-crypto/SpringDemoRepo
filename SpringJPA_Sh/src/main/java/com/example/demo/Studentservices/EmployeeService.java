package com.example.demo.Studentservices;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.StudentRepo.EmployeeRepo;
import com.example.demo.module.Employee;
@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	public void saveEmployee() {
		
		Employee emp = new Employee(102, "Ram", 55000.2);
		Employee emp1 = new Employee(103, "Madhav", 45000.2);
		Employee emp2 = new Employee(104, "Shyam", 35000.2);
		Employee emp3 = new Employee(105, "Raghu", 25000.2);
		Employee emp4 = new Employee(106, "Vaibhav", 65000.2);
		List<Employee> ep = Arrays.asList(emp,emp1,emp2,emp3,emp4);
	    employeeRepo.saveAll(ep);
		
	}
}

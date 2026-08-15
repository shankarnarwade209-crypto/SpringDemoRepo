package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.Studentservices.EmployeeService;
import com.example.demo.Studentservices.StudentService;

@SpringBootApplication
public class SpringJpaShApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ap = SpringApplication.run(SpringJpaShApplication.class, args);
		EmployeeService empService = ap.getBean(EmployeeService.class);
		empService.saveEmployee();
	}

}
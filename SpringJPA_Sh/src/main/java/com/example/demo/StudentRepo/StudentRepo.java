package com.example.demo.StudentRepo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.module.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}

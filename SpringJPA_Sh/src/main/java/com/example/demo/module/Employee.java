package com.example.demo.module;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Emp")
public class Employee {

	@Id
	private int E_Id;
	private String E_Name;
	private double E_Salary;
	
	public Employee() {
		
	}
	
	public Employee(int e_Id, String e_Name, double e_Salary) {
		super();
		E_Id = e_Id;
		E_Name = e_Name;
		E_Salary = e_Salary;
	}
	public int getE_Id() {
		return E_Id;
	}
	public void setE_Id(int e_Id) {
		E_Id = e_Id;
	}
	public String getE_Name() {
		return E_Name;
	}
	public void setE_Name(String e_Name) {
		E_Name = e_Name;
	}
	public double getE_Salary() {
		return E_Salary;
	}
	public void setE_Salary(double e_Salary) {
		E_Salary = e_Salary;
	}
	@Override
	public String toString() {
		return "Employee [E_Id=" + E_Id + ", E_Name=" + E_Name + ", E_Salary=" + E_Salary + "]";
	}
	
}

package com.example.demo.module;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="stu")
public class Student {

	@Id
	private int s_Id;
	private String s_FirstName;
	private String s_LastName;
	public int getS_Id(int i) {
		return s_Id;
	}
	public void setS_Id(int s_Id) {
		this.s_Id = s_Id;
	}
	public String getS_FirstName() {
		return s_FirstName;
	}
	public void setS_FirstName(String s_FirstName) {
		this.s_FirstName = s_FirstName;
	}
	public String getS_LastName() {
		return s_LastName;
	}
	public void setS_LastName(String s_LastName) {
		this.s_LastName = s_LastName;
	}
	@Override
	public String toString() {
		return "Student [s_Id=" + s_Id + ", s_FirstName=" + s_FirstName + ", s_LastName=" + s_LastName + "]";
	}
	
	
}

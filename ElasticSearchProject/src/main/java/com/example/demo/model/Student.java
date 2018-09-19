package com.example.demo.model;

public class Student {
	
	private String studentName;
	private Integer rollNo;
	private String cgpa;
	
	public Integer getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getCgpa() {
		return cgpa;
	}
	
	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}

}

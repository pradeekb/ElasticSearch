package com.example.demo.model;

import java.util.ArrayList;

public class StudentDetail {

	private String departmentName;
	private String passedOut;
	private ArrayList<Student> studentList;
	private Student student;
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public String getPassedOut() {
		return passedOut;
	}
	
	public void setPassedOut(String passedOut) {
		this.passedOut = passedOut;
	}
	
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

}

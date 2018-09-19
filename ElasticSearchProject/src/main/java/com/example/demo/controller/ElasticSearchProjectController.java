package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.client.ElasticSearchClient;
import com.example.demo.model.College;
import com.example.demo.model.Employee;
import com.example.demo.model.StudentDetail;

@RestController
public class ElasticSearchProjectController {
	
	@Autowired
	ElasticSearchClient elasticSearchClient;
	
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public Employee getEmployeeDetail(@PathVariable("id") String id) throws Exception {
		
		Employee employeeDetail = elasticSearchClient.employeeDetail(id);
		
		return employeeDetail;
	}
	
	
	@RequestMapping(value = "/addStudentDetail", method = RequestMethod.POST)
	public void addStudentDetail(StudentDetail studentDetail) throws Exception {
		
		elasticSearchClient.addStudentDetail(studentDetail);
		
	}
	
	
	
	


}

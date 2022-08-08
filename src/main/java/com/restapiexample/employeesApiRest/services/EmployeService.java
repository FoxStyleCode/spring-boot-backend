package com.restapiexample.employeesApiRest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.restapiexample.employeesApiRest.models.ResponseEmploye;
import com.restapiexample.employeesApiRest.models.ResponseEmployees;

public class EmployeService {
	
	@Autowired
    RestTemplate restTemplate;
    public ResponseEmployees getResponse(){
    	
    	String url = "http://dummy.restapiexample.com/api/v1/employees";
		
    	RestTemplate restTemplate = new RestTemplate();
    	ResponseEmployees data = restTemplate.getForObject(url, ResponseEmployees.class);
    	
    	return data;
    }

    public ResponseEmploye getResponseEmploye(Integer id){
    	
    	String url = "http://dummy.restapiexample.com/api/v1/employee/" + id;
		
    	RestTemplate restTemplate = new RestTemplate();
    	ResponseEmploye data = restTemplate.getForObject(url, ResponseEmploye.class);
    	
    	return data;
    }

}

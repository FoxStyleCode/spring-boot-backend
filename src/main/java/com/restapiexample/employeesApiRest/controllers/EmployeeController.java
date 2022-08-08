package com.restapiexample.employeesApiRest.controllers;

import java.math.BigDecimal;

import java.util.ArrayList;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.restapiexample.employeesApiRest.models.Employe;
import com.restapiexample.employeesApiRest.models.ResponseEmploye;
import com.restapiexample.employeesApiRest.models.ResponseEmployees;
import com.restapiexample.employeesApiRest.services.EmployeService;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController extends EmployeService {
	
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEmployees getAllEmployees() {
		
		ResponseEmployees data = this.getResponse();
		
		List<Employe> employees = new ArrayList<>();
		
		for (Employe employe : data.getData()) {
			employe.setEmployee_anual_salary(employe.getEmployee_salary().multiply(new BigDecimal(12)));
			employees.add(employe);
		}
	
		return new ResponseEmployees(data.getStatus(), employees, data.getMessage());
		
	}
	
	@RequestMapping("/{id}")
	public Object getEmployee(@PathVariable("id") Integer id) {
		
		ResponseEmploye data = this.getResponseEmploye(id);
		data.getData().setEmployee_anual_salary(data.getData().getEmployee_salary().multiply(new BigDecimal(12)));
			
		
		return data;
		
	}
	
	

}

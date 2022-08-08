package com.restapiexample.employeesApiRest.models;

import java.util.List;

public class ResponseEmployees {
	
	private String status;
	private List<Employe> data = null;
	private String message;
	
	public ResponseEmployees() {}

	public ResponseEmployees(String status, List<Employe> data, String message) {
		super();
		this.status = status;
		this.data = data;
		this.message = message;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public List<Employe> getData() {
		return data;
	}

	public void setData(List<Employe> data) {
		this.data = data;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}

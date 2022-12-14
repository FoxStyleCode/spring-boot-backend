package com.restapiexample.employeesApiRest.models;

import java.math.BigDecimal;
import javax.persistence.*;

@Entity
public class Employe {
	
	@Id
    @GeneratedValue
	private Long id;
	
	private String employee_name;
	
	private BigDecimal employee_salary;
	
	private Integer employee_age;
	
	private String profile_image;
	
	private BigDecimal employee_anual_salary;
	
	public Employe() {}

	public Employe(Long id, String employee_name, BigDecimal employee_salary, Integer employee_age,
			String profile_image, BigDecimal employee_anual_salary) {
		super();
		this.id = id;
		this.employee_name = employee_name;
		this.employee_salary = employee_salary;
		this.employee_age = employee_age;
		this.profile_image = profile_image;
		this.employee_anual_salary = employee_anual_salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public BigDecimal getEmployee_salary() {
		return employee_salary;
	}

	public void setEmployee_salary(BigDecimal employee_salary) {
		this.employee_salary = employee_salary;
	}

	public Integer getEmployee_age() {
		return employee_age;
	}

	public void setEmployee_age(Integer employee_age) {
		this.employee_age = employee_age;
	}

	public String getProfile_image() {
		return profile_image;
	}

	public void setProfile_image(String profile_image) {
		this.profile_image = profile_image;
	}

	public BigDecimal getEmployee_anual_salary() {
		return employee_anual_salary;
	}

	public void setEmployee_anual_salary(BigDecimal employee_anual_salary) {
		this.employee_anual_salary = employee_anual_salary;
	}


	
	
	

}

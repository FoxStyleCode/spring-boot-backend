package com.restapiexample.employeesApiRest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restapiexample.employeesApiRest.models.Employe;
import com.restapiexample.employeesApiRest.models.ResponseEmployees;


public interface EmployeRepository extends JpaRepository<Employe, Long>{
	
}

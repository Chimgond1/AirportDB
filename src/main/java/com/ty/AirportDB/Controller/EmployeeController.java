package com.ty.AirportDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ty.AirportDB.Service.EmployeeService;
import com.ty.AirportDB.dto.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees/{id}")
	public Employee findById(@PathVariable double id){
		return employeeService.getEmployeeById(id);
	}
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	

}

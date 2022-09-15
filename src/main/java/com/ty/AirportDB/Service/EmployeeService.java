package com.ty.AirportDB.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.AirportDB.dao.EmployeeDao;
import com.ty.AirportDB.dto.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao employeeDao;
	
	public List<Employee> getAllEmployee(){
		return employeeDao.getAllEmployee();
	}
	public Employee getEmployeeById(Double id){
		return employeeDao.getEmployeeById(id);
		
	}

}

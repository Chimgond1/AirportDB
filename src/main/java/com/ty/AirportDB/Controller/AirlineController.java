package com.ty.AirportDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ty.AirportDB.Service.AirlineService;
import com.ty.AirportDB.Service.EmployeeService;
import com.ty.AirportDB.dto.Airline;
import com.ty.AirportDB.dto.Employee;

@RestController
public class AirlineController {
	
	@Autowired
	AirlineService airlineService;
	
	@GetMapping("/airlines/{id}")
	public Airline findById(@PathVariable int id){
		return airlineService.getAirlineById(id);
	}
	@GetMapping("/airlines")
	public List<Airline> getAllAirline(){
		return airlineService.getAllAirline();
	}
	

}

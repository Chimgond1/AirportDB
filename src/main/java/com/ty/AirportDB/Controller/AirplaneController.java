package com.ty.AirportDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ty.AirportDB.Service.AirplaneService;
import com.ty.AirportDB.dto.Airplane;

@RestController
public class AirplaneController {

	@Autowired
	AirplaneService airplaneService;
	
	@GetMapping("/airplanes/{id}")
	public Airplane findById(@PathVariable double id){
		return airplaneService.getAirplaneById(id);
	}
	@GetMapping("/airplanes")
	public List<Airplane> getAllBooking(){
		return airplaneService.getAllAirplane();
	}
	
}

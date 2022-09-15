package com.ty.AirportDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ty.AirportDB.Service.FlightService;
import com.ty.AirportDB.dto.Flight;

@RestController
public class FlightController {
	@Autowired
	FlightService flightService;
	@GetMapping("/flights/{id}")
	public Flight findFlightById(@PathVariable int id){
		return flightService.findFlightById(id);
	}
	@GetMapping("/flights")
	public List<Flight> getAllFlight(){
		return flightService.getAllFlight();
	}

}

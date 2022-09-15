package com.ty.AirportDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.AirportDB.Service.PassengerService;
import com.ty.AirportDB.dto.Booking;
import com.ty.AirportDB.dto.Passenger;

@RestController
public class PassengerController {
	@Autowired
	private PassengerService passengerService;

	@PostMapping("/passenger")
	public Passenger savePassenger(@RequestBody Passenger passenger) {
		return passengerService.savePassenger(passenger);
	}

	@GetMapping("/passengers")
	public List<Passenger> getAll() {
		return passengerService.getAll();
	}
	@GetMapping("/passengers/{passenger_id}")
	public List<Booking> getPassangerByName(@PathVariable double passenger_id) {
		return passengerService.getPassangerByName(passenger_id);
	}
}

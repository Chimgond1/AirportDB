package com.ty.AirportDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.AirportDB.Service.PassengerDetailsService;
import com.ty.AirportDB.Service.PassengerService;
import com.ty.AirportDB.dto.PassengerDetails;

@RestController
public class PassengerDetailsController {
	@Autowired
	PassengerDetailsService passengerDetailsService;
	@PostMapping("/passengerdetails")
	public PassengerDetails savePassengerDetails(@RequestBody PassengerDetails passengerDetails){
          return passengerDetailsService.savePassengerDetails(passengerDetails);
	}
	@GetMapping("/passengerdetails")
	public List<PassengerDetails> getAllPassengerDetails(){
		return passengerDetailsService.getAllPassengerDetails();
	}
}

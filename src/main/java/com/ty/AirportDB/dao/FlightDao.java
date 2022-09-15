package com.ty.AirportDB.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.AirportDB.Repository.FlightRepository;
import com.ty.AirportDB.dto.Flight;

@Repository
public class FlightDao {
	@Autowired
	FlightRepository flightRepository;
	public List<Flight> getAllFlight(){
		 return flightRepository.findAll();
	}
	public Flight findFlightById(int id){
		Optional<Flight> optional=flightRepository.findById(id); 
		if(optional.isEmpty()) {
			return null;
		}else {
			return optional.get();
		}
	}

}

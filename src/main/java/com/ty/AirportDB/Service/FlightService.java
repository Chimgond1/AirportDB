package com.ty.AirportDB.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.AirportDB.dao.FlightDao;
import com.ty.AirportDB.dto.Flight;

@Service
public class FlightService {
	@Autowired
	FlightDao flightDao;
	public List<Flight> getAllFlight(){
		return flightDao.getAllFlight();
	}
	public Flight findFlightById(int id){
		return flightDao.findFlightById(id);
	}

}

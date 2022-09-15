package com.ty.AirportDB.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.AirportDB.Repository.PassengerRepository;
import com.ty.AirportDB.dto.Booking;
import com.ty.AirportDB.dto.Passenger;

@Repository
public class PassengerDao {
	@Autowired
	private PassengerRepository passengerRepository;

	public Passenger savePassenger(Passenger passenger) {
		return passengerRepository.save(passenger);
	}

	public List<Passenger> getAll() {
		return passengerRepository.findAll();
	}
	public List<Booking> getPassangerByName(double  passenger_id) {
		return passengerRepository.getPassangerByName(passenger_id);
	}

}

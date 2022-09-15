package com.ty.AirportDB.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.AirportDB.dao.PassengerDao;
import com.ty.AirportDB.dto.Booking;
import com.ty.AirportDB.dto.Passenger;

@Service
public class PassengerService {
	@Autowired
	private PassengerDao passengerDao;

	public Passenger savePassenger(Passenger passenger) {
		return passengerDao.savePassenger(passenger);
	}

	public List<Passenger> getAll() {
		return passengerDao.getAll();
	}
	public List<Booking> getPassangerByName(double  passenger_id) {
		return passengerDao.getPassangerByName(passenger_id);
	}

}

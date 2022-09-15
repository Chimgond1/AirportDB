package com.ty.AirportDB.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.AirportDB.dao.PassengerDao;
import com.ty.AirportDB.dao.PassengerDetailsDao;
import com.ty.AirportDB.dto.PassengerDetails;

@Service
public class PassengerDetailsService {
	@Autowired
	PassengerDetailsDao passengerDetailsDao;
	public PassengerDetails savePassengerDetails(PassengerDetails passengerDetails){
		return passengerDetailsDao.savePassengerDetails(passengerDetails);
	}
	public List<PassengerDetails> getAllPassengerDetails(){
		return passengerDetailsDao.getAllPassengerDetails();
	}
}

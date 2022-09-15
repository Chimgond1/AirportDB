package com.ty.AirportDB.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.AirportDB.Repository.PassengerDetailsRepository;
import com.ty.AirportDB.dto.PassengerDetails;

@Repository
public class PassengerDetailsDao {
	@Autowired
	PassengerDetailsRepository passengerDetailsRepository;
	
	public PassengerDetails savePassengerDetails(PassengerDetails passengerDetails){
		return passengerDetailsRepository.save(passengerDetails);
		
	}
	public List<PassengerDetails> getAllPassengerDetails(){
		return passengerDetailsRepository.findAll();
	}

}

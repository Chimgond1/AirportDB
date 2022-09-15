package com.ty.AirportDB.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.AirportDB.Repository.AirlineRepository;
import com.ty.AirportDB.dto.Airline;

@Repository
public class AirlineDao {
	@Autowired
	AirlineRepository airlineRepository;
	public Airline getAirlineById(int id){
		Optional<Airline> optional=airlineRepository.findById(id);
		if(optional!=null) {
			return null;
		}else {
			return optional.get();
		}
	}
	public List<Airline> getAllAirline(){
		return airlineRepository.findAll();
	}

}

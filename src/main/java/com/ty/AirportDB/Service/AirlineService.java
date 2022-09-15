package com.ty.AirportDB.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.AirportDB.dao.AirlineDao;
import com.ty.AirportDB.dto.Airline;

@Service
public class AirlineService {
	@Autowired
	AirlineDao airlineDao;
	
	public Airline getAirlineById(int id){
		return airlineDao.getAirlineById(id);
		
	}
	public List<Airline> getAllAirline(){
		return airlineDao.getAllAirline();
	}

}

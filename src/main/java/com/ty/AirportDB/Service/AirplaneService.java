package com.ty.AirportDB.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.AirportDB.dao.AirplaneDao;
import com.ty.AirportDB.dto.Airplane;

@Service
public class AirplaneService {
	@Autowired
	AirplaneDao airplaneDao;
	public List<Airplane> getAllAirplane(){
		return airplaneDao.getAllAirplane();
	}
	public Airplane getAirplaneById(Double id){
		return airplaneDao.getAirplaneById(id);
		
	}

}

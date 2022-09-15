package com.ty.AirportDB.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.AirportDB.Repository.AirplaneRepository;
import com.ty.AirportDB.dto.Airplane;

import lombok.Data;

@Repository
public class AirplaneDao {
	@Autowired
	AirplaneRepository airplaneRepository;
	public List<Airplane> getAllAirplane(){
		return airplaneRepository.findAll();
	}
	public Airplane getAirplaneById(Double id){
		Optional<Airplane> optional=airplaneRepository.findById(id);
		if(optional.isEmpty()) {
			return null;
		}else {
			return optional.get();
		}
	}

}

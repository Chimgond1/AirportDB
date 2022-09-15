package com.ty.AirportDB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.AirportDB.dto.Airline;

public interface AirlineRepository extends JpaRepository<Airline, Integer>{

}

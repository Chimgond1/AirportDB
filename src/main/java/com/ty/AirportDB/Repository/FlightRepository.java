package com.ty.AirportDB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.AirportDB.dto.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer>{

}

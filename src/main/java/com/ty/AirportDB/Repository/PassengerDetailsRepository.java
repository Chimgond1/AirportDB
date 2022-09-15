package com.ty.AirportDB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.AirportDB.dto.PassengerDetails;

public interface PassengerDetailsRepository extends JpaRepository<PassengerDetails, Integer>{

}

package com.ty.AirportDB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.AirportDB.dto.Airplane;

public interface AirplaneRepository extends JpaRepository<Airplane, Double>{

}

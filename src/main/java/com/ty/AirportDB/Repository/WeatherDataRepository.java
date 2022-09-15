package com.ty.AirportDB.Repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.AirportDB.dto.WeatherData;

public interface WeatherDataRepository extends JpaRepository<WeatherData, LocalDate> {

}

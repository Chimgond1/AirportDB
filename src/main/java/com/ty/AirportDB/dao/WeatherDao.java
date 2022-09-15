package com.ty.AirportDB.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.AirportDB.Repository.WeatherDataRepository;
import com.ty.AirportDB.dto.WeatherData;

@Repository
public class WeatherDao {
	@Autowired
	private WeatherDataRepository weatherDataRepository;

	public WeatherData saveData(WeatherData weatherData) {
		return weatherDataRepository.save(weatherData);

	}

	public List<WeatherData> getAll() {
		return weatherDataRepository.findAll();
	}
}

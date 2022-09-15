package com.ty.AirportDB.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.AirportDB.dao.WeatherDao;
import com.ty.AirportDB.dto.WeatherData;

@Service
public class WeatherDataService {
	@Autowired
	private WeatherDao weatherDao;

	public WeatherData saveData(WeatherData weatherData) {
		return weatherDao.saveData(weatherData);

	}

	public List<WeatherData> getAll() {
		return weatherDao.getAll();
	}
}

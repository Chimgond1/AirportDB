package com.ty.AirportDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.AirportDB.Service.WeatherDataService;
import com.ty.AirportDB.dto.WeatherData;

@RestController
public class WeatherController {
	@Autowired
	private WeatherDataService dataService;

	@PostMapping("/weathers")
	public WeatherData saveData(@RequestBody WeatherData weatherData) {
		return dataService.saveData(weatherData);

	}

	@GetMapping("/weathers")
	public List<WeatherData> getAll() {
		return dataService.getAll();
	}
}

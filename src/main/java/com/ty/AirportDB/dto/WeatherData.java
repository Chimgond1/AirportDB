package com.ty.AirportDB.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class WeatherData {
	@Id
	private LocalDate log_date;
	private LocalDateTime time;
	private int station;
	private double temp;
	private double humidity;
	private double airpressure;
	private double wind;
	private int winddirection;

	
}

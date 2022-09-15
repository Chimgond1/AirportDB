package com.ty.AirportDB.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Airline {
	@Id
	private double airline_id;
	private String iata;
	private String airlinename;
	private double base_airport;

	
}

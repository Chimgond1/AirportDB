package com.ty.AirportDB.dto;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
@Entity
@Data
public class Flight {

	@Id
	private double flight_id;
	private String flightno;
	private double from;
	private double to;
	private String departure;
	private String arrival;
	private double airline_id;
	private double airplane_id;
//	@OneToMany(mappedBy = "flight",cascade = CascadeType.ALL)
//	private Booking booking;
	
	
}

package com.ty.AirportDB.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
@Entity
@Data
public class Booking {
	@Id
	private double booking_id;
	private double flight_id;
	private String seat;
	private double passenger_id;
	private double price;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn
//	private Passenger passenger;
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn
//	private Flight flight;

	

}

package com.ty.AirportDB.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Passenger {
	@Id
	private double passenger_id;
	private String passportno;
	private String firstname;
	private String lastname;
//	@OneToOne(mappedBy = "passenger",cascade = CascadeType.ALL)
//	Booking booking;
//	@OneToOne(mappedBy = "passenger_id",cascade = CascadeType.ALL)
//	PassengerDetails passenger_id;
}

package com.ty.AirportDB.dto;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
@Entity
@Data
public class PassengerDetails {
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn
//	//Passenger passenger;
	@Id
	private double passenger_id;
	private LocalDate birthdate;
	private char sex;
	private String street;
	private String city;
	private int zip;
	private String country;
	private String emailaddress;
	private String telephoneno;

	
}

package com.ty.AirportDB.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Airplane {
	@Id
	private double airplane_id;
	private double capacity;
	private double type_id;
	private double airline_id;

}

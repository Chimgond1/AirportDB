package com.ty.AirportDB.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee {
	@Id
	private double employee_id;
	private String firstname;
	private String lastname;
	private String birthdate;
	private String sex;
	private String street;
	private String city;
	private double zip;
	private String country;
	private String emailaddress;
	private String telephoneno;
	private double salary;
	private String department;
	private String username;
	private String password;
	
}

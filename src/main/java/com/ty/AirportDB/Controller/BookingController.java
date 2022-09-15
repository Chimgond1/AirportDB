package com.ty.AirportDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ty.AirportDB.Service.BookingService;
import com.ty.AirportDB.dto.Booking;

@RestController
public class BookingController {
	@Autowired
	BookingService bookingService;
	
	@GetMapping("/booking/{id}")
	public Booking findById(@PathVariable int id){
		return bookingService.findById(id);
	}
	@GetMapping("/booking")
	public List<Booking> getAllBooking(){
		return bookingService.getAllBooking();
	}

}

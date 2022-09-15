package com.ty.AirportDB.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.AirportDB.Repository.BookingRepository;
import com.ty.AirportDB.dto.Booking;

@Repository
public class BookingDao {
	@Autowired
	BookingRepository bookingRepository;
	
	public List<Booking> getAllBooking(){
		return bookingRepository.findAll();
	}
	public Booking findById(int id){
		Optional<Booking> book=bookingRepository.findById(id);
		if(book.isEmpty()) {
			return null;
		}else {
			return book.get();
		}
	}

}

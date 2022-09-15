package com.ty.AirportDB.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.AirportDB.dao.BookingDao;
import com.ty.AirportDB.dto.Booking;

@Service
public class BookingService {
	@Autowired
	BookingDao bookingDao;
	public List<Booking> getAllBooking(){
		return bookingDao.getAllBooking();
	}
	public Booking findById(int id){
		return bookingDao.findById(id);
	}

}

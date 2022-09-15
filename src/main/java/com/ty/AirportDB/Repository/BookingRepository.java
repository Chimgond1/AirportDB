package com.ty.AirportDB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.AirportDB.dto.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer>{

}

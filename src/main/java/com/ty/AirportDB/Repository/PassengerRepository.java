package com.ty.AirportDB.Repository;





import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ty.AirportDB.dto.Booking;
import com.ty.AirportDB.dto.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
//	@Query("select r from Passenger r where r.firstname=?1")
//	Passenger getPassangerByName(String firstname); 
//	
	
	@Query("Select r from Booking r where r.passenger_id in (select p.passenger_id from PassengerDetails p  "
			+ "where p.passenger_id in (select b from Passenger b where b.passenger_id=?1 ))")
//			+ "where "
//			+ " p.passenger_id in (select b from Booking b  ))")
	List<Booking> getPassangerByName(double  passenger_id); 
	
//	where b.flight_id in(select f from "
//			+ " Flight f   )
}

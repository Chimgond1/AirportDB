package com.ty.AirportDB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.AirportDB.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Double>{

}

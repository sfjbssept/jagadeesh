package com.fms.service;

import com.fms.entity.Flight;
import com.fms.repo.IAdminFlightRepo;

import org.springframework.beans.factory.annotation.Autowired;



public class AdminFlightServiceImpl implements IAdminFlightService{

	@Autowired
	IAdminFlightRepo FlightRepository;
	
	@Override
	public Integer addFlight(Flight flight) {
		// TODO Auto-generated method stub
		Flight addFlight = FlightRepository.save(flight);
		return  addFlight.getId();
	}

}

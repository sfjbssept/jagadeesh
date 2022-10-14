package com.fms.service;

import com.fms.entity.Flight;
import com.fms.repo.IAdminFlightRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminFlightServiceImpl implements IAdminFlightService{

	@Autowired
	IAdminFlightRepo flightRepository;
	
	@Override
	public Integer addFlight(Flight flight) {
		// TODO Auto-generated method stub
		Flight addFlight = flightRepository.save(flight);
		return  addFlight.getId();
	}
	
	
	

	@Override
	public List<Flight> getAllFlights() {
		// TODO Auto-generated method stub
		return flightRepository.findAll();
	}

}

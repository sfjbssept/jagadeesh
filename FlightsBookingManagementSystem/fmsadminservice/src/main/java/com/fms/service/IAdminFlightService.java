package com.fms.service;

import java.util.List;

import com.fms.entity.Flight;




public interface IAdminFlightService {
	Integer addFlight(Flight flight);
	
	public List<Flight> getAllFlights();
	
}

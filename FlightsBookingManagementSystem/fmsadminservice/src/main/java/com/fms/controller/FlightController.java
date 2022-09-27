package com.fms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fms.entity.Flight;
import com.fms.service.IAdminFlightService;

public class FlightController {
	
	@Autowired
	IAdminFlightService flightService;
	
	@PostMapping("/addFlight")
	Integer addFlight(@RequestBody Flight flight) {
		Integer id = flightService.addFlight(flight);
		return id;
	}
	
}

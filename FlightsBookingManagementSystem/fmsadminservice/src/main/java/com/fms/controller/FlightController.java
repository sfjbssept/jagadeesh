package com.fms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fms.entity.Flight;
import com.fms.service.IAdminFlightService;

@RestController
public class FlightController {
	
	@Autowired
	IAdminFlightService flightService;
	
	@PostMapping("/addflight")
	Integer addFlight(@RequestBody Flight flight) {
		Integer id = flightService.addFlight(flight);
		return id;
	}
	
}
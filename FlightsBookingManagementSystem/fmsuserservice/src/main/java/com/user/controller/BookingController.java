package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.user.entity.Booking;
import com.user.service.BookingService;

public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	@GetMapping("/user/getBookings")
	List<Booking> getBookings(){
		return bookingService.getBookings();
	}
	
	
	@PostMapping("/user/addBooking")
	Booking addBooking(@RequestBody Booking booking) {
		return bookingService.addBooking(booking);
	}
	
	
	@DeleteMapping("/user/deletebooking/{id}")
	Booking deleteBooking(@PathVariable int id) {
		return bookingService.deleteBooking(id);
	}
}

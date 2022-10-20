package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.Booking;

@Service
public interface BookingService {
	public List<Booking> getBookings();
	
	public Booking addBooking(Booking booking);
	
	public Booking updateBooking(Integer id, Booking booking);
	
	public Booking deleteBooking(Integer id);
}

package com.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.Booking;
import com.user.repo.UserBookingRepository;

@Service
public class BookingServiceImple implements BookingService{

	@Autowired
	UserBookingRepository bookingRepository;
	
	@Override
	public List<Booking> getBookings() {
		// TODO Auto-generated method stub
		return bookingRepository.findAll();
	}

	@Override
	public Booking addBooking(Booking booking) {
		// TODO Auto-generated method stub
		return bookingRepository.save(booking);
	}

	@Override
	public Booking updateBooking(Integer id, Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking deleteBooking(Integer id) {
		// TODO Auto-generated method stub
		Optional<Booking> existingBooking = bookingRepository.findById(id);
		Booking existingBookingData =  existingBooking.get();
		bookingRepository.delete(existingBookingData);
		
		return existingBookingData;
	}

}

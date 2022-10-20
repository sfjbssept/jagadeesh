package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.Booking;
import com.user.entity.User;
import com.user.service.BookingService;
import com.user.service.UserService;

@RestController
public class BookingController {

	@Value("${admin-service}")
	private String adminServiceUrl;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private BookingService bookingService;
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/user/addUser")
	User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	

	@PostMapping("/getAllFlights")
	public String getAllFlightDetail() {
		
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String > httpEntity = new HttpEntity<String>(headers);
		
		ResponseEntity<String> responce=restTemplate.exchange(adminServiceUrl, HttpMethod.GET, httpEntity, String.class);
		
		String flightDetails = responce.getBody();
		
		
		return flightDetails;
	}
	
	
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

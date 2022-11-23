package com.user.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.user.entity.Booking;
import com.user.entity.User;
import com.user.service.BookingService;
import com.user.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BookingController {

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	UserService userService;
	
	@Autowired
	private BookingService bookingService;
	
	@GetMapping("/getuser")
	public List<User> getUsers()
	{
		return userService.getUsers();
	}
	
	
	@PostMapping("/adduser")
	public User createUser(@RequestBody User user)
	{
		return userService.addUser(user);
	}
	

	@GetMapping("/getAllFlights")
	public String getAllFlightDetails() {
		
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String > httpEntity = new HttpEntity<String>(headers);
		String url = "http://admin-service/getAllFlights";
		ResponseEntity<String> responce=restTemplate.exchange(url, HttpMethod.GET, httpEntity, String.class);
		
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

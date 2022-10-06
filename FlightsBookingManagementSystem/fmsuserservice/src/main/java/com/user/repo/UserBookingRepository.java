package com.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entity.Booking;

public interface UserBookingRepository extends JpaRepository<Booking, Integer>{

}
 
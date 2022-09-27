package com.fms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fms.entity.Flight;



public interface IAdminFlightRepo extends JpaRepository<Flight,Integer>{

}

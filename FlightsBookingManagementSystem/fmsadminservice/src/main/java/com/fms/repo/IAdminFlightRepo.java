package com.fms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fms.entity.Flight;


@Repository
public interface IAdminFlightRepo extends JpaRepository<Flight,Integer>{

}

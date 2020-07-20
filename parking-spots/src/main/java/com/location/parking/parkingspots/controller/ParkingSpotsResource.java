package com.location.parking.parkingspots.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.location.parking.parkingspots.bean.ParkingSpots;
import com.location.parking.parkingspots.service.ParkingSpotsService;

@RestController
public class ParkingSpotsResource {
	
	@Autowired
	ParkingSpotsService parkingSpotsService;
	
	@GetMapping("/parkingSpots/{cityName}")
	public ParkingSpots retrieveParkingspotsLocation(@PathVariable String cityName){
		
		return parkingSpotsService.retrieveParkingspotsLocation(cityName);
		
	}
	
	
	

}

package com.location.stations.charging.chargingstations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.location.stations.charging.chargingstations.bean.ChargingStation;
import com.location.stations.charging.chargingstations.service.ChargingStationService;

@RestController
public class ChargingStationResource {
	
	@Autowired
	ChargingStationService chargingStationService;
	
	@GetMapping("/chargingSpots/{cityName}")
	public ChargingStation retrieveChargingspotsLocation(@PathVariable String cityName){
		
		return chargingStationService.retrieveChargingStationLocation(cityName);
		
	}
	
	
	

}

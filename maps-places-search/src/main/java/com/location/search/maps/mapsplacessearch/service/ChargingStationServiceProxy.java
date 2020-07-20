package com.location.search.maps.mapsplacessearch.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.location.search.maps.mapsplacessearch.bean.ChargingStation;


@FeignClient(name="charging-stations", url="localhost:8000")
public interface ChargingStationServiceProxy {
	

	
	@GetMapping("/chargingSpots/{cityName}")
	public ChargingStation retrieveChargingStationLocation(@PathVariable("cityName") String cityName);
	
	
	

}

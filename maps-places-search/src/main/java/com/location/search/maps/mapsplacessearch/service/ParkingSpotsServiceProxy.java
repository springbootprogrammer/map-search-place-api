package com.location.search.maps.mapsplacessearch.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.location.search.maps.mapsplacessearch.bean.ParkingSpots;



@FeignClient(name="parking-spots", url="localhost:8100")
public interface ParkingSpotsServiceProxy {
	

	
	@GetMapping("/parkingSpots/{cityName}")
	public ParkingSpots retrieveParkingspotsLocation(@PathVariable("cityName") String cityName);	
	
	

}

package com.location.search.maps.mapsplacessearch.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.location.search.maps.mapsplacessearch.bean.Restaurant;


@FeignClient(name="restaurants-service", url="localhost:8200")
public interface RestaurantServiceProxy {
	
	
	
	@GetMapping("/restaurants/{cityName}")
	public Restaurant retrieveRestaurantLocation(@PathVariable("cityName") String cityName);	
		

}

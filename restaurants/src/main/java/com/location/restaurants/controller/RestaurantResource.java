package com.location.restaurants.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.location.restaurants.bean.Restaurant;
import com.location.restaurants.service.RestaurantService;

@RestController
public class RestaurantResource {
	
	@Autowired
	RestaurantService restaurantService;
	
	@GetMapping("/restaurants/{cityName}")
	public Restaurant retrieveRestaurantLocation(@PathVariable String cityName){
		
		return restaurantService.retrieveRestaurantLocation(cityName);
		
	}
	
		

}

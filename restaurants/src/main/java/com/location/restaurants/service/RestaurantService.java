package com.location.restaurants.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.location.restaurants.bean.Restaurant;
import com.location.restaurants.bean.Restaurantlocation;

@Component
public class RestaurantService {
	
	private static Map<String,Restaurant> restaurantlocationCities=new HashMap<>();
	
	static {
		Restaurantlocation restaurantlocation=new Restaurantlocation("marathalli","560016");
		Restaurant parkingSpots=new Restaurant("Hydrabad biryani",restaurantlocation);
		Restaurantlocation restaurantlocationPune=new Restaurantlocation("Raj Nagar","89013");
		Restaurant puneParkingSpots=new Restaurant("Punjaji Dhaba",restaurantlocationPune);
		restaurantlocationCities.put("bangalore",parkingSpots );
		restaurantlocationCities.put("pune",puneParkingSpots );
	}
	
	public Restaurant retrieveRestaurantLocation(String city){
		return restaurantlocationCities.get(city);
		
	}
	
}	
	
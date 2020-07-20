package com.location.restaurants;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.location.restaurants.bean.Restaurant;
import com.location.restaurants.service.RestaurantService;

@SpringBootTest
class RestaurantsApplicationTests {
	
	@Autowired
	private RestaurantService restaurantService;
	
	
	@Test
	public void testRetrieveRestaurantLocationFind(){
		Restaurant restaurant=restaurantService.retrieveRestaurantLocation("bangalore");
		assertNotNull(restaurant); 
	}
	
	@Test
	public void testRetrieveRestaurantLocationNotFind(){
		Restaurant restaurant=restaurantService.retrieveRestaurantLocation("hydrabad");
		assertNull(restaurant); 
	}

}

package com.location.search.maps.mapsplacessearch;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.location.search.maps.mapsplacessearch.bean.ChargingStation;
import com.location.search.maps.mapsplacessearch.bean.ParkingSpots;
import com.location.search.maps.mapsplacessearch.bean.Restaurant;
import com.location.search.maps.mapsplacessearch.service.ChargingStationServiceProxy;
import com.location.search.maps.mapsplacessearch.service.ParkingSpotsServiceProxy;
import com.location.search.maps.mapsplacessearch.service.RestaurantServiceProxy;



@SpringBootTest
class MapsPlacesSearchApplicationTests {

	@Autowired
	private ChargingStationServiceProxy chargingStationServiceProxy;
	
	@Autowired
	private ParkingSpotsServiceProxy parkingSpotsServiceProxy;
	
	@Autowired
	private RestaurantServiceProxy restaurantServiceProxy;
	
	@Test
	public void testRetrieveChargingStationLocationFind(){
		ChargingStation chargingStation=chargingStationServiceProxy.retrieveChargingStationLocation("bangalore");
		assertNotNull(chargingStation);
		
	}
	
	@Test
	public void testRetrieveChargingStationLocationNotFind(){
		ChargingStation chargingStation=chargingStationServiceProxy.retrieveChargingStationLocation("hydrabad");
		assertNull(chargingStation);
		
	}
	

	@Test
	public void testRetrieveParkingspotsLocationFind(){
		ParkingSpots parkingSpots=parkingSpotsServiceProxy.retrieveParkingspotsLocation("bangalore");
		assertNotNull(parkingSpots);
	}
	
	@Test
	public void testRetrieveParkingspotsLocationNotFind(){
		ParkingSpots parkingSpots=parkingSpotsServiceProxy.retrieveParkingspotsLocation("hydrabad");
		assertNull(parkingSpots);
	}
	
	@Test
	public void testRetrieveRestaurantLocationFind(){
		Restaurant restaurant=restaurantServiceProxy.retrieveRestaurantLocation("bangalore");
		assertNotNull(restaurant); 
	}
	
	@Test
	public void testRetrieveRestaurantLocationNotFind(){
		Restaurant restaurant=restaurantServiceProxy.retrieveRestaurantLocation("hydrabad");
		assertNull(restaurant); 
	}
	

}

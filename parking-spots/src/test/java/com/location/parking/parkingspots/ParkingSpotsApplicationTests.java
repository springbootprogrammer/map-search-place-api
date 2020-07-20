package com.location.parking.parkingspots;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.location.parking.parkingspots.bean.ParkingSpots;
import com.location.parking.parkingspots.service.ParkingSpotsService;

@SpringBootTest
class ParkingSpotsApplicationTests {
    
	@Autowired
	private ParkingSpotsService parkingSpotsService;
	
	@Test
	public void testRetrieveParkingspotsLocationFind(){
		ParkingSpots parkingSpots=parkingSpotsService.retrieveParkingspotsLocation("bangalore");
		assertNotNull(parkingSpots);
	}
	
	@Test
	public void testRetrieveParkingspotsLocationNotFind(){
		ParkingSpots parkingSpots=parkingSpotsService.retrieveParkingspotsLocation("hydrabad");
		assertNull(parkingSpots);
	}
	

}

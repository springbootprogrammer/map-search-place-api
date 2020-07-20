package com.location.stations.charging.chargingstations;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.location.stations.charging.chargingstations.bean.ChargingStation;
import com.location.stations.charging.chargingstations.service.ChargingStationService;

@SpringBootTest
class ChargingStationsApplicationTests {

	@Autowired
	private ChargingStationService chargingStationService;
	
	@Test
	public void testRetrieveChargingStationLocationFind(){
		ChargingStation chargingStation=chargingStationService.retrieveChargingStationLocation("bangalore");
		assertNotNull(chargingStation);
		
	}
	
	@Test
	public void testRetrieveChargingStationLocationNotFind(){
		ChargingStation chargingStation=chargingStationService.retrieveChargingStationLocation("hydrabad");
		assertNull(chargingStation);
		
	}

	
	
}

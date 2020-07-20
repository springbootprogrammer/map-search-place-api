package com.location.stations.charging.chargingstations.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.location.stations.charging.chargingstations.bean.ChargingStation;
import com.location.stations.charging.chargingstations.bean.ChargingStationlocation;

@Component
public class ChargingStationService {
	
	private static Map<String,ChargingStation> chargingSpotsCities=new HashMap<>();
	
	static {
		ChargingStationlocation chargingStationlocation=new ChargingStationlocation("Jeevan Bima Nagar","67000");
		ChargingStation chargingStation=new ChargingStation("SemaConnect charging station",chargingStationlocation);
		ChargingStationlocation chargingStationlocationPune=new ChargingStationlocation("adarsh nagar","68000");
		ChargingStation puneChargingStation=new ChargingStation("pune charging station",chargingStationlocationPune);
		chargingSpotsCities.put("bangalore",chargingStation );
		chargingSpotsCities.put("pune",puneChargingStation );
	}
	
	public ChargingStation retrieveChargingStationLocation(String city){
		return chargingSpotsCities.get(city);
		
	}

		
}	
	
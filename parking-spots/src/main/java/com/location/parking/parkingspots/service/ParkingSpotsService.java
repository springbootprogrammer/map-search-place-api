package com.location.parking.parkingspots.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.location.parking.parkingspots.bean.ParkingSpots;
import com.location.parking.parkingspots.bean.ParkingSpotslocation;

@Component
public class ParkingSpotsService {
	
	private static Map<String,ParkingSpots> parkingSpotsCities=new HashMap<>();
	
	static {
		ParkingSpotslocation parkingSpotslocation=new ParkingSpotslocation("marathalli","678901");
		ParkingSpots parkingSpots=new ParkingSpots("commercial street parking",parkingSpotslocation);
		ParkingSpotslocation parkingSpotslocationPune=new ParkingSpotslocation("xyz","678956");
		ParkingSpots puneParkingSpots=new ParkingSpots("pune street parking",parkingSpotslocationPune);
		parkingSpotsCities.put("bangalore",parkingSpots );
		parkingSpotsCities.put("pune",puneParkingSpots );
	}
	
	public ParkingSpots retrieveParkingspotsLocation(String city){
		return parkingSpotsCities.get(city);
		
	}
	
}	
	
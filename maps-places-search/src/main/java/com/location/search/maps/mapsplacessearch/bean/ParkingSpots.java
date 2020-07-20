package com.location.search.maps.mapsplacessearch.bean;

public class ParkingSpots {
	
	private String parkingName;
	private ParkingSpotslocation parkingSpotsLocation;
	
	
	
	public ParkingSpots() {
	}
	
	public ParkingSpots(String parkingName, ParkingSpotslocation parkingSpotsLocation) {
		super();
		this.parkingName = parkingName;
		this.parkingSpotsLocation = parkingSpotsLocation;
	}
	public String getParkingName() {
		return parkingName;
	}
	public void setParkingName(String parkingName) {
		this.parkingName = parkingName;
	}
	public ParkingSpotslocation getParkingSpotsLocation() {
		return parkingSpotsLocation;
	}
	public void setParkingSpotsLocation(ParkingSpotslocation parkingSpotsLocation) {
		this.parkingSpotsLocation = parkingSpotsLocation;
	}
	@Override
	public String toString() {
		return "ParkingSpots [parkingName=" + parkingName + ", parkingSpotsLocation=" + parkingSpotsLocation + "]";
	}
	
	
	

}

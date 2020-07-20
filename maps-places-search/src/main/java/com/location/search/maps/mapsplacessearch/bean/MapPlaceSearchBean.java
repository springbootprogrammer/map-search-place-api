package com.location.search.maps.mapsplacessearch.bean;

public class MapPlaceSearchBean {
	
	private ChargingStation chargingStation;
	private ParkingSpots parkingSpots;
	private Restaurant restaurant;
	
	
	public MapPlaceSearchBean() {
		
	}
	public MapPlaceSearchBean(ChargingStation chargingStation, ParkingSpots parkingSpots, Restaurant restaurant) {
		super();
		this.chargingStation = chargingStation;
		this.parkingSpots = parkingSpots;
		this.restaurant = restaurant;
	}
	public ChargingStation getChargingStation() {
		return chargingStation;
	}
	public void setChargingStation(ChargingStation chargingStation) {
		this.chargingStation = chargingStation;
	}
	public ParkingSpots getParkingSpots() {
		return parkingSpots;
	}
	public void setParkingSpots(ParkingSpots parkingSpots) {
		this.parkingSpots = parkingSpots;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	@Override
	public String toString() {
		return "MapPlaceSearchBean [chargingStation=" + chargingStation + ", parkingSpots=" + parkingSpots
				+ ", restaurant=" + restaurant + "]";
	}
	
	

}

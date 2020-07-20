package com.location.search.maps.mapsplacessearch.bean;

public class Restaurant {
	
	private String restaurantName;
	private Restaurantlocation restaurantlocation;
	
	
	public Restaurant() {
			}
	public Restaurant(String restaurantName, Restaurantlocation restaurantlocation) {
		super();
		this.restaurantName = restaurantName;
		this.restaurantlocation = restaurantlocation;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public Restaurantlocation getRestaurantlocation() {
		return restaurantlocation;
	}
	public void setRestaurantlocation(Restaurantlocation restaurantlocation) {
		this.restaurantlocation = restaurantlocation;
	}
	@Override
	public String toString() {
		return "Restaurant [restaurantName=" + restaurantName + ", restaurantlocation=" + restaurantlocation + "]";
	}
	
	
	
	

}

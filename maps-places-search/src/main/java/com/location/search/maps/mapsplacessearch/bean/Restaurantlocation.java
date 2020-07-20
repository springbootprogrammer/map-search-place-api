package com.location.search.maps.mapsplacessearch.bean;

public class Restaurantlocation {
	
	
	private String streetAddress;
	private String zipCode;
	
	
	
	public Restaurantlocation() {
	
	}
	public Restaurantlocation(String streetAddress, String zipCode) {
		super();
		this.streetAddress = streetAddress;
		this.zipCode = zipCode;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Restaurantlocation [streetAddress=" + streetAddress + ", zipCode=" + zipCode + "]";
	}
	
	
	
	
	

}

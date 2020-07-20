package com.location.stations.charging.chargingstations.bean;

public class ChargingStationlocation {
	
	
	private String streetAddress;
	private String zipCode;
	
	
	public ChargingStationlocation(String streetAddress, String zipCode) {
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
		return "ChargingStationlocation [streetAddress=" + streetAddress + ", zipCode=" + zipCode + "]";
	}
	
	
	

}

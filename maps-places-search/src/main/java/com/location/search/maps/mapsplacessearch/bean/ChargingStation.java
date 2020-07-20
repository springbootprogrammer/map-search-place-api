package com.location.search.maps.mapsplacessearch.bean;

public class ChargingStation {
	
	private String chargingStationName;
	private ChargingStationlocation chargingStationlocation;
	
	
	
	public ChargingStation() {
		
		
	}


	public ChargingStation(String chargingStationName, ChargingStationlocation chargingStationlocation) {
		super();
		this.chargingStationName = chargingStationName;
		this.chargingStationlocation = chargingStationlocation;
	}


	public String getChargingStationName() {
		return chargingStationName;
	}


	public void setChargingStationName(String chargingStationName) {
		this.chargingStationName = chargingStationName;
	}


	public ChargingStationlocation getChargingStationlocation() {
		return chargingStationlocation;
	}


	public void setChargingStationlocation(ChargingStationlocation chargingStationlocation) {
		this.chargingStationlocation = chargingStationlocation;
	}


	@Override
	public String toString() {
		return "ChargingStation [chargingStationName=" + chargingStationName + ", chargingStationlocation="
				+ chargingStationlocation + "]";
	}
	
	
	
	
	

}

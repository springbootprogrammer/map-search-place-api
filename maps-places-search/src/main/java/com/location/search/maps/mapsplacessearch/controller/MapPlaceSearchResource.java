package com.location.search.maps.mapsplacessearch.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.location.search.maps.mapsplacessearch.bean.ChargingStation;
import com.location.search.maps.mapsplacessearch.bean.MapPlaceSearchBean;
import com.location.search.maps.mapsplacessearch.bean.ParkingSpots;
import com.location.search.maps.mapsplacessearch.bean.Restaurant;
import com.location.search.maps.mapsplacessearch.service.ChargingStationServiceProxy;
import com.location.search.maps.mapsplacessearch.service.ParkingSpotsServiceProxy;
import com.location.search.maps.mapsplacessearch.service.RestaurantServiceProxy;

@RestController
public class MapPlaceSearchResource {
	
	@Autowired
	private ChargingStationServiceProxy chargingStationServiceProxy;
	
	@Autowired
	private ParkingSpotsServiceProxy parkingSpotsServiceProxy;
	
	@Autowired
	private RestaurantServiceProxy restaurantServiceProxy;
	
	private Map<String,MapPlaceSearchBean> cachedDataByCity=new HashMap<>();
	
	@GetMapping("/mapPlaceSearch/{cityName}")
	public MapPlaceSearchBean retrieveMapPlaceSearch(@PathVariable String cityName){
		
		if (cachedDataByCity.get(cityName)!=null)
		{
			System.out.println(" getting data from cachedMap "+ cachedDataByCity.get(cityName));
			return cachedDataByCity.get(cityName);
		}	
		
		ChargingStation chargingStation=chargingStationServiceProxy.retrieveChargingStationLocation(cityName);
		ParkingSpots parkingSpots=parkingSpotsServiceProxy.retrieveParkingspotsLocation(cityName);
		Restaurant restaurant=restaurantServiceProxy.retrieveRestaurantLocation(cityName);
		
		MapPlaceSearchBean MapPlaceSearchBean=new MapPlaceSearchBean(chargingStation,parkingSpots,restaurant);
		System.out.println("Cacheddata "+ MapPlaceSearchBean);
		cachedDataByCity.put(cityName, MapPlaceSearchBean);
		return MapPlaceSearchBean;
		
	}
	

}

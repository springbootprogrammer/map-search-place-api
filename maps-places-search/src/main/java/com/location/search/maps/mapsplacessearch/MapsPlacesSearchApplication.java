package com.location.search.maps.mapsplacessearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.location.search.maps.mapsplacessearch")
public class MapsPlacesSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapsPlacesSearchApplication.class, args);
	}

}

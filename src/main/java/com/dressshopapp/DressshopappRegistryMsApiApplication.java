package com.dressshopapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class DressshopappRegistryMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DressshopappRegistryMsApiApplication.class, args);
	}

}

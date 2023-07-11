package com.skillstorm.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GolfShopApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GolfShopApiApplication.class, args);
	}

}

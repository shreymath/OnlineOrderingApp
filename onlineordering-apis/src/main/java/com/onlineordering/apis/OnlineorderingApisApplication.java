package com.onlineordering.apis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OnlineorderingApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineorderingApisApplication.class, args);
	}
}

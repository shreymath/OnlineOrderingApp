package com.app.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class StandaloneEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StandaloneEurekaServerApplication.class, args);
	}
}

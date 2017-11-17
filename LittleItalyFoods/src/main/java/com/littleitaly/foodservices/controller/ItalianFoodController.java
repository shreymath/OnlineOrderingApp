package com.littleitaly.foodservices.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.ribbon.proxy.annotation.Http.HttpMethod;

@RestController
@RequestMapping("/italiancuisines")
public class ItalianFoodController {

@Autowired
RestTemplate restTemplate;
	
@RequestMapping("/getmenu")
public String getItalianFoodMenu() throws URISyntaxException {
		URI url = new URI("http://onlineordering-service/onlineordering/cuisines/1/getmenuitems");
		String response = restTemplate.exchange(url, org.springframework.http.HttpMethod.GET, null, String.class).getBody();
		return response;

	}
	

@Bean
@LoadBalanced
public RestTemplate restTemplate() {
    return new RestTemplate();
}

}

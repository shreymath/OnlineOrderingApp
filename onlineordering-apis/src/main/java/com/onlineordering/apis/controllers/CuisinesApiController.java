package com.onlineordering.apis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.onlineordering.apis.models.Cuisine;
import com.onlineordering.apis.services.CusinesApiService;

@RestController
@RequestMapping("/onlineordering")
public class CuisinesApiController {

@Autowired
private CusinesApiService cusineApiService;	
	
	@RequestMapping("/getcuisines")
	public List<Cuisine> getCuisines() {
		return cusineApiService.getCuisines();
	}
	
	@RequestMapping("/getcuisine/{ID}")
	public Cuisine getCuisine(@PathVariable("ID") String id) {
		return cusineApiService.getCuisine(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/createcuisine")
	public String createCuisine(@RequestBody Cuisine cuisine) {
		if(cusineApiService.createCuisine(cuisine)) {
			return cuisine.getCuisineName()+" added !!";
		}
		return "Cuisine adding failed !! Please contact administrator";
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/updateCuisine")
	public String updateCuisine(@RequestBody Cuisine cuisine) {
		if(cusineApiService.updateCuisine(cuisine)) {
			return cuisine.getCuisineName()+" updated !!";
		}
		return "Cuisine updating failed !! Please contact administrator";
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/deleteCuisine/{id}")
	public String deleteCuisine(@PathVariable String id ) {
		if(cusineApiService.deleteCuisine(id)) {
			return "Cuisine deleted !!";
		}
		return "Deleting Cuisine failed !! Please contact administrator";
	}
}

package com.onlineordering.apis.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineordering.apis.models.Cuisine;
import com.onlineordering.apis.repositories.CusinesRepository;

@Service
public class CusinesApiService {

	@Autowired
	private CusinesRepository cusinesRepository;
	/*private List<Cuisine> cuisinesList = new ArrayList<Cuisine>(Arrays.asList(
			new Cuisine("1","Java", "Core Java 8 with POCs"),
			new Cuisine("2","AngularJs", "AnjularJs 4 with POCs"),
			new Cuisine("3","Oracle", "Oracle 12g"))
			);*/
	
	public List<Cuisine> getCuisines() {
		List<Cuisine> cuisine = new ArrayList<Cuisine>();
		cusinesRepository.findAll().forEach(cuisine :: add);
		return cuisine;
	}
	
	public Cuisine getCuisine(String id) {
		return cusinesRepository.findOne(id);
	}
	
	public boolean createCuisine(Cuisine cuisine) {
			cusinesRepository.save(cuisine);
			return true;
	}
	
	public boolean updateCuisine(Cuisine cuisine) {
		cusinesRepository.save(cuisine);
		 return true;
	}
	
	public boolean deleteCuisine(String id) {
		cusinesRepository.delete(id);
		return true;
	}
}

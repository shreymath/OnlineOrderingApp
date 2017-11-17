package com.onlineordering.apis.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cuisine {

	@Id
	private String cuisineId;
	private String cuisineName;
	private String cuisineDescription;
	
	public Cuisine(){

	}
	
	public Cuisine(String cuisineId, String cuisineName, String cuisineDescription){
		super();
		this.cuisineId = cuisineId;
		this.cuisineName = cuisineName;
		this.cuisineDescription = cuisineDescription;
	}
	
	public String getCuisineId() {
		return cuisineId;
	}
	public void setCuisineId(String cuisineId) {
		this.cuisineId = cuisineId;
	}
	public String getCuisineName() {
		return cuisineName;
	}
	public void setCuisineName(String cuisineName) {
		this.cuisineName = cuisineName;
	}
	public String getCuisineDescription() {
		return cuisineDescription;
	}
	public void setCuisineDescription(String cuisineDescription) {
		this.cuisineDescription = cuisineDescription;
	}
	
	
	
}

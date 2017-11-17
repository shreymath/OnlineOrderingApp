package com.onlineordering.apis.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class MenuItems {

	@Id
	private String id;
	private String menuItemName;
	private String menuItemDescription;
	@ManyToOne
	private Cuisine cuisine;
	
	public MenuItems(){

	}
	
	public MenuItems(String menuitemId, String menuitemName, String menuitemDescription, String cuisineId){
		super();
		this.id = menuitemId;
		this.menuItemName = menuitemName;
		this.menuItemDescription = menuitemDescription;
		this.cuisine = new Cuisine(cuisineId, "", "");
	}
	
	public String getId() {
		return id;
	}
	public void setId(String menuitemId) {
		this.id = menuitemId;
	}
	public String getMenuItemName() {
		return menuItemName;
	}
	public void setMenuItemName(String menuitemName) {
		this.menuItemName = menuitemName;
	}
	public String getMenuItemDescription() {
		return menuItemDescription;
	}
	public void setMenuItemDescription(String menuitemDescription) {
		this.menuItemDescription = menuitemDescription;
	}
	public Cuisine getCuisine() {
		return cuisine;
	}
	public void setCuisine(Cuisine cuisine) {
		this.cuisine = cuisine;
	}
	
	
}

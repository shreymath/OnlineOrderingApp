package com.onlineordering.apis.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.onlineordering.apis.models.MenuItems;

public interface MenuItemsRepository extends CrudRepository<MenuItems, String> {

	//public List<MenuItems> findByMenuItemName(String menuItemName);
	//public List<MenuItems> findByMenuItemDescription(String menuItemDescription);
	public List<MenuItems> findByCuisineCuisineId(String cuisineId);
}

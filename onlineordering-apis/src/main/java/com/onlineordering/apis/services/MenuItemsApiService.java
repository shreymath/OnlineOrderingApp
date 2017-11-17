package com.onlineordering.apis.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineordering.apis.models.MenuItems;
import com.onlineordering.apis.repositories.MenuItemsRepository;

@Service
public class MenuItemsApiService {

	@Autowired
	private MenuItemsRepository menuItemsRepository;
	
	public List<MenuItems> getMenuItems(String cuisineId) {
		List<MenuItems> menuitem = new ArrayList<MenuItems>();
		menuItemsRepository.findByCuisineCuisineId(cuisineId).forEach(menuitem :: add);
		return menuitem;
	}
	
	public MenuItems getMenuItem(String id) {
		return menuItemsRepository.findOne(id);
	}
	
	public boolean createMenuItem(MenuItems menuitem) {
			menuItemsRepository.save(menuitem);
			return true;
	}
	
	public boolean updateMenuItem(MenuItems menuitem) {
		menuItemsRepository.save(menuitem);
		 return true;
	}
	
	public boolean deleteMenuItem(String id) {
		menuItemsRepository.delete(id);
		return true;
	}
}

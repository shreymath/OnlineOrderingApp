package com.onlineordering.apis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.onlineordering.apis.models.Cuisine;
import com.onlineordering.apis.models.MenuItems;
import com.onlineordering.apis.services.MenuItemsApiService;

@RestController
@RequestMapping("/onlineordering/")
public class MenuItemsApiController {

@Autowired
private MenuItemsApiService menuitemApiService;	
	
	@RequestMapping("cuisines/{cuisineId}/getmenuitems")
	public List<MenuItems> getMenuItems(@PathVariable String cuisineId) {
		return menuitemApiService.getMenuItems(cuisineId);
	}
	
	@RequestMapping("cuisines/{cuisineId}/getmenuitem/{menuItemId}")
	public MenuItems getMenuItem(@PathVariable String menuItemId) {
		return menuitemApiService.getMenuItem(menuItemId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="cuisine/{cuisineId}/createmenuitem")
	public String createMenuItem( @RequestBody MenuItems menuitem, @PathVariable String cuisineId) {
		menuitem.setCuisine(new Cuisine(cuisineId, "", ""));
		if(menuitemApiService.createMenuItem(menuitem)) {
			return menuitem.getMenuItemName()+" added !!";
		}
		return "MenuItem adding failed !! Please contact administrator";
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="cuisine/{cuisineId}/updatemenuitem/{menuItemId}")
	public String updateMenuItem(@PathVariable String cuisineId, @PathVariable String menuItemId, @RequestBody MenuItems menuitem) {
		menuitem.setCuisine(new Cuisine(cuisineId, "", ""));
		if(menuitemApiService.updateMenuItem(menuitem)) {
			return menuitem.getMenuItemName()+" updated !!";
		}
		return "MenuItem updating failed !! Please contact administrator";
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="cuisine/{cuisineId}/deletemenuitem/{menuItemId}")
	public String deleteMenuItem(@PathVariable String menuItemId ) {
		if(menuitemApiService.deleteMenuItem(menuItemId)) {
			return "MenuItem deleted !!";
		}
		return "Deleting MenuItem failed !! Please contact administrator";
	}
}

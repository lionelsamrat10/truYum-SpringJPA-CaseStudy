package com.cognizant.truyum;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.service.MenuItemService;
import com.cognizant.truyum.util.DateUtil;

@SpringBootApplication
@ComponentScan("com.cognizant.truyum")
public class App {

	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	// static reference of the MenuItemService class
	private static MenuItemService menuItemService;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);

		// assigning from context
		menuItemService = context.getBean(MenuItemService.class);
		LOGGER.info("Start of Main!!!");
		//test the GetMenuItemListAdmin()
		testGetMenuItemListAdmin();
		//test the GetMenuItemListCustomer()
		testGetMenuItemListCustomer();
		//test Get Menu Item method
		testGetMenuItem();
		//test the Edit Menu Item method..
		testEditMenuItem();
		LOGGER.info("End of Main!!!");
	}
	
	//Create the test method for getMenuItemListAdmin()
	private static void testGetMenuItemListAdmin() {
		LOGGER.info("Start of testGetMenuItemListAdmin()");

		List<MenuItem> menuItems = menuItemService.getMenuItemListAdmin();
		LOGGER.debug("Menu Item List Admin:", menuItems);
		LOGGER.info("End of testGetMenuItemListAdmin()");
	}
	//Create the test method for getMenuItemListCustomer()
	private static void testGetMenuItemListCustomer() {
		LOGGER.info("Start of testGetMenuItemListCustomer()");
		List<MenuItem> menuItems = menuItemService.getMenuItemListCustomer();
		LOGGER.debug("Menu Item List Customer:", menuItems);
		LOGGER.info("End of testGetMenuItemListCustomer()");
	}

	private static void testGetMenuItem() {
		LOGGER.info("Start of testGetMenuItem()");
		/*MenuItem menuItem =*/ menuItemService.getMenuItem(2);
		LOGGER.info("End of testGetMenuItem()");
	}
	
	private static void testEditMenuItem() {
		LOGGER.info("Start of  testEditMenuItem()");
		MenuItem menuItem = new MenuItem(3, "Baklava", 32f, "yes", DateUtil.convertToDate("02/04/2021"), "Sweet Dessert", "yes");
		menuItemService.editMenuItem(menuItem);
		LOGGER.info("End of  testEditMenuItem()");
	}

}

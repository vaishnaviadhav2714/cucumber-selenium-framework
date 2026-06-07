package com.saucedemo.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {
    // Locators
	private final By pageTitle =
	        By.className("title");
	private final By shoppingCartLink =
			By.className("shopping_cart_link");
	private final By inventoryItems =
	        By.className("inventory_item_name");
	private final By cartBadge =
	        By.className("shopping_cart_badge");
	
	// Constructor
	public ProductsPage(WebDriver driver) {
		super(driver);
	}
	
	// Actions
	public boolean isProductPageDisplayed() {
	    return getText(pageTitle)
	            .equalsIgnoreCase("Products");
	}
	
	public void openShoppingCart() {

	    click(shoppingCartLink);
	}
	
	public int getProductCount() {

	    return driver.findElements(inventoryItems)
	                 .size();
	}
	
	private By addToCartButton(String productName) {
	    String xpath =
	          "//div[text()='" + productName +
	            "']/ancestor::div[@class='inventory_item']//button";
	    return By.xpath(xpath);
	}
	
	public void addProductToCart(String productName) {

	    click(addToCartButton(productName));
	}
	
	public int getCartBadgeCount() {

	    return Integer.parseInt(
	            getText(cartBadge));
	}
	

}

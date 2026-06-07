package com.saucedemo.automation.pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
	private final By sortDropdown =
	        By.className("product_sort_container");
	private final By productPrices =
	        By.className("inventory_item_price");
	
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
	
	public void selectSortOption(String option) {

	    Select select = new Select(driver.findElement(sortDropdown));
	    select.selectByVisibleText(option);
	}
	
	public List<String> getProductNames() {

	    List<WebElement> products =
	            driver.findElements(inventoryItems);

	    return products.stream()
	            .map(WebElement::getText)
	            .collect(Collectors.toList());
	}
	
	public List<Double> getProductPrices() {

	    List<WebElement> prices =
	            driver.findElements(productPrices);
	    return prices.stream()
	            .map(e -> Double.parseDouble(
	                    e.getText().replace("$", "")
	            ))
	            .collect(Collectors.toList());
	}
	

}

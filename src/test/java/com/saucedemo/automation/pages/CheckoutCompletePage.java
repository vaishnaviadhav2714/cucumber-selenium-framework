package com.saucedemo.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage extends BasePage {

	// Locators
	private final By successMessage =
	        By.className("complete-header");
	
	// Constructor
	public CheckoutCompletePage(WebDriver driver) {
		super(driver);
	}
	
	 // Actions
	public String getSuccessMessage() {

	    return getText(successMessage);
	}

}

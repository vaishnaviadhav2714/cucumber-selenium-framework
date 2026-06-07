package com.saucedemo.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage extends BasePage {
    
	// Locators
	private final By finishButton =
	        By.id("finish");
	
	// Constructor
	public CheckoutOverviewPage(WebDriver driver) {
		super(driver);
	}
	
	// Actions
	public void clickFinish() {
	    click(finishButton);
	}

}

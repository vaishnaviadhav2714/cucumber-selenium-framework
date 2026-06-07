package com.saucedemo.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutInformationPage extends BasePage {
	
	//Locators
	private final By firstNameInput =
	        By.id("first-name");

	private final By lastNameInput =
	        By.id("last-name");

	private final By postalCodeInput =
	        By.id("postal-code");

	private final By continueButton =
	        By.id("continue");
	
	// Constructor
	public CheckoutInformationPage(WebDriver driver) {
	    super(driver);
	}
	
	// Actions
	public void enterFirstName(String firstName) {

	    type(firstNameInput, firstName);
	}
	public void enterLastName(String lastName) {

	    type(lastNameInput, lastName);
	}
	public void enterPostalCode(String postalCode) {

	    type(postalCodeInput, postalCode);
	}
	public void clickContinue() {

	    click(continueButton);
	}
	
	
	

}

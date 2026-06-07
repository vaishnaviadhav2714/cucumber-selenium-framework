package com.saucedemo.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    
	//Locators
	private final By usernameInput = 
			By.id("user-name");
	private final By passwordInput =
			By.id("password");
	private final By loginButton = 
			By.id("login-button");
	private final By errorMessage =
	        By.cssSelector("h3[data-test='error']");
	
	// Constructor
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	//Actions
	public void enterUsername(String username) {
		type(usernameInput,username);
	 }
	public void enterPassword(String password) {
		 type(passwordInput,password);	
	 }
	public void clickLoginButton() {
		click(loginButton);
	}
	  // Business Method
	 public void loginAs(String username, String password) {
		 enterUsername(username);
		 enterPassword(password);
		 clickLoginButton();
	   }

	  // Validation Methods
	  public String getLoginErrorMessage() {
		  return getText(errorMessage);
	  }

	public boolean isLoginPageDisplayed() {
	      return isDisplayed(loginButton);
	  }
	
}

package com.saucedemo.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage extends BasePage {

    // Locators
    private final By menuButton =
            By.id("react-burger-menu-btn");

    private final By logoutLink =
            By.id("logout_sidebar_link");

    private final By loginButton =
            By.id("login-button");

    // Constructor
    public LogoutPage(WebDriver driver) {
        super(driver);
    }

    // Actions
    public void openMenu() {
        click(menuButton);
    }

    public void clickLogout() {
        click(logoutLink);
    }

    // Validation
    public boolean isLoginPageDisplayed() {
        return isDisplayed(loginButton);
    }
}
package com.saucedemo.automation.stepdefinitions;

import com.saucedemo.automation.pages.LoginPage;
import com.saucedemo.automation.pages.ProductsPage;
import com.saucedemo.automation.reports.ExtentTestManager;
import com.saucedemo.automation.utils.ConfigReader;
import com.saucedemo.automation.factory.DriverFactory;
import org.testng.Assert;
import io.cucumber.java.en.*;

public class LoginStepDefinition {

    private LoginPage loginPage;
    private ProductsPage productsPage;

    @Given("User is on login page")
    public void user_is_on_login_page() {
         
    	ExtentTestManager.getTest().info("Entering login credentials");
        // Initialize page with driver
        loginPage = new LoginPage(DriverFactory.getDriver());

        // Open URL from config
        DriverFactory.getDriver().get(ConfigReader.getBaseUrl());
    }

    @When("User enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("User clicks on login button")
    public void user_clicks_on_login_button() {

        loginPage.clickLoginButton();
    }

    @Then("User should be navigated to products page")
    public void user_should_be_navigated_to_products_page() {
        productsPage =
                new ProductsPage(DriverFactory.getDriver());
        Assert.assertTrue(
                productsPage.isProductPageDisplayed()
        );
        
    }

    @Then("User should see locked out user error message")
    public void user_should_see_locked_out_error_message() {

        String actualMessage = loginPage.getLoginErrorMessage();
        String expectedMessage =
                "Epic sadface: Sorry, this user has been locked out.";
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
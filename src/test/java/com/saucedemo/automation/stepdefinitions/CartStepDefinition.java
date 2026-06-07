package com.saucedemo.automation.stepdefinitions;

import org.testng.Assert;

import com.saucedemo.automation.factory.DriverFactory;
import com.saucedemo.automation.pages.CartPage;
import com.saucedemo.automation.pages.LoginPage;
import com.saucedemo.automation.pages.ProductsPage;
import com.saucedemo.automation.reports.ExtentTestManager;
import com.saucedemo.automation.utils.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartStepDefinition {

    private LoginPage loginPage;
    private ProductsPage productsPage;
    private CartPage cartPage;

    @Given("User is logged in")
    public void user_is_logged_in() {

        ExtentTestManager.getTest()
                .info("Logging into SauceDemo");

        loginPage = new LoginPage(
                DriverFactory.getDriver());

        loginPage.loginAs(
                ConfigReader.getUsername(),
                ConfigReader.getPassword());

        productsPage = new ProductsPage(
                DriverFactory.getDriver());
    }

    @When("User opens shopping cart")
    public void open_cart() {

        productsPage.openShoppingCart();
    }

    @Then("Cart should contain {string} items")
    public void verify_cart_items(String expectedCount) {

        cartPage = new CartPage(
                DriverFactory.getDriver());

        Assert.assertTrue(
                cartPage.isCartPageDisplayed(),
                "User is not on Cart Page");

        Assert.assertEquals(
                cartPage.getCartItemCount(),
                Integer.parseInt(expectedCount));
    }
}
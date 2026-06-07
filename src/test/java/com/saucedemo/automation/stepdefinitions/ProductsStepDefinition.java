package com.saucedemo.automation.stepdefinitions;

import org.testng.Assert;

import com.saucedemo.automation.factory.DriverFactory;
import com.saucedemo.automation.pages.ProductsPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductsStepDefinition {

    private ProductsPage productsPage;

    @When("User adds {string} to cart")
    public void add_product_to_cart(String productName) {

        productsPage = new ProductsPage(DriverFactory.getDriver());

        productsPage.addProductToCart(productName);
    }

    @Then("Cart badge should show {string}")
    public void verify_cart_badge(String expectedCount) {

        productsPage = new ProductsPage(DriverFactory.getDriver());

        Assert.assertEquals(
                productsPage.getCartBadgeCount(),
                Integer.parseInt(expectedCount)
        );
    }
}
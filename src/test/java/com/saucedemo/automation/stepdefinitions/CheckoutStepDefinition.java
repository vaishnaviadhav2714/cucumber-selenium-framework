package com.saucedemo.automation.stepdefinitions;

import org.testng.Assert;

import com.saucedemo.automation.factory.DriverFactory;
import com.saucedemo.automation.pages.CartPage;
import com.saucedemo.automation.pages.CheckoutCompletePage;
import com.saucedemo.automation.pages.CheckoutInformationPage;
import com.saucedemo.automation.pages.CheckoutOverviewPage;
import com.saucedemo.automation.pages.LoginPage;
import com.saucedemo.automation.pages.ProductsPage;
import com.saucedemo.automation.reports.ExtentTestManager;
import com.saucedemo.automation.utils.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutStepDefinition {

    private LoginPage loginPage;
    private ProductsPage productsPage;
    private CartPage cartPage;
    private CheckoutInformationPage checkoutInfoPage;
    private CheckoutOverviewPage checkoutOverviewPage;
    private CheckoutCompletePage checkoutCompletePage;

    // ADD PRODUCT
    @When("User adds product to cart")
    public void add_product_to_cart() {

        productsPage = new ProductsPage(DriverFactory.getDriver());
        productsPage.addProductToCart("Sauce Labs Backpack");
    }

    // CLICK CHECKOUT
    @When("User clicks on checkout button")
    public void click_checkout() {

        cartPage = new CartPage(DriverFactory.getDriver());
        cartPage.clickCheckout();
    }

    // CHECKOUT INFORMATION
    @When("User enters checkout information")
    public void enter_checkout_information() {

        checkoutInfoPage = new CheckoutInformationPage(DriverFactory.getDriver());

        checkoutInfoPage.enterFirstName(ConfigReader.getProperty("firstName"));
        checkoutInfoPage.enterLastName(ConfigReader.getProperty("lastName"));
        checkoutInfoPage.enterPostalCode(ConfigReader.getProperty("postalCode"));
    }

    // CONTINUE
    @When("User continues to checkout overview")
    public void continue_to_overview() {

        checkoutInfoPage.clickContinue();
    }

    // FINISH ORDER
    @When("User finishes the order")
    public void finish_order() {

        checkoutOverviewPage = new CheckoutOverviewPage(DriverFactory.getDriver());
        checkoutOverviewPage.clickFinish();
    }

    // VALIDATION
    @Then("Order should be placed successfully")
    public void verify_order_success() {

        checkoutCompletePage = new CheckoutCompletePage(DriverFactory.getDriver());

        Assert.assertEquals(
                checkoutCompletePage.getSuccessMessage(),
                "Thank you for your order!"
        );
    }
}
package com.saucedemo.automation.stepdefinitions;

import org.testng.Assert;

import com.saucedemo.automation.factory.DriverFactory;
import com.saucedemo.automation.pages.LogoutPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefinition {

    private LogoutPage logoutPage;

    @When("User opens application menu")
    public void user_opens_application_menu() {

        logoutPage =
                new LogoutPage(DriverFactory.getDriver());

        logoutPage.openMenu();
    }

    @When("User clicks logout option")
    public void user_clicks_logout_option() {

        logoutPage.clickLogout();
    }

    @Then("User should be navigated to login page")
    public void user_should_be_navigated_to_login_page() {

        Assert.assertTrue(
                logoutPage.isLoginPageDisplayed()
        );
    }
}
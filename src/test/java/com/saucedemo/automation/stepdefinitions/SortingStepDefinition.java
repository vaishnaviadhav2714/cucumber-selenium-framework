package com.saucedemo.automation.stepdefinitions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.Assert;

import com.saucedemo.automation.factory.DriverFactory;
import com.saucedemo.automation.pages.ProductsPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SortingStepDefinition {

    private final ProductsPage productsPage =
            new ProductsPage(DriverFactory.getDriver());

    @When("User selects {string} sorting option")
    public void user_selects_sorting_option(String option) {

        productsPage.selectSortOption(option);
    }

    @Then("Products should be sorted correctly for {string}")
    public void verify_sorting(String sortOption) {

        switch (sortOption) {

            case "Name (A to Z)":

                List<String> actualNamesAZ =
                        productsPage.getProductNames();

                List<String> expectedNamesAZ =
                        new ArrayList<>(actualNamesAZ);

                Collections.sort(expectedNamesAZ);

                Assert.assertEquals(
                        actualNamesAZ,
                        expectedNamesAZ,
                        "Products are not sorted A-Z");

                break;

            case "Name (Z to A)":

                List<String> actualNamesZA =
                        productsPage.getProductNames();

                List<String> expectedNamesZA =
                        new ArrayList<>(actualNamesZA);

                expectedNamesZA.sort(
                        Collections.reverseOrder());

                Assert.assertEquals(
                        actualNamesZA,
                        expectedNamesZA,
                        "Products are not sorted Z-A");

                break;

            case "Price (low to high)":

                List<Double> actualPricesLH =
                        productsPage.getProductPrices();

                List<Double> expectedPricesLH =
                        new ArrayList<>(actualPricesLH);

                Collections.sort(expectedPricesLH);

                Assert.assertEquals(
                        actualPricesLH,
                        expectedPricesLH,
                        "Prices are not sorted low to high");

                break;

            case "Price (high to low)":

                List<Double> actualPricesHL =
                        productsPage.getProductPrices();

                List<Double> expectedPricesHL =
                        new ArrayList<>(actualPricesHL);

                expectedPricesHL.sort(
                        Collections.reverseOrder());

                Assert.assertEquals(
                        actualPricesHL,
                        expectedPricesHL,
                        "Prices are not sorted high to low");

                break;

            default:
                Assert.fail("Invalid sorting option: " + sortOption);
        }
    }
}
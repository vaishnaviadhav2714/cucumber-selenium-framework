package com.saucedemo.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    // Locators
    private final By cartItems =
            By.className("inventory_item_name");

    private final By checkoutButton =
            By.id("checkout");

    private final By cartTitle =
            By.className("title");

    // Constructor
    public CartPage(WebDriver driver) {
        super(driver);
    }

    // Validation
    public boolean isCartPageDisplayed() {

        return getText(cartTitle)
                .equalsIgnoreCase("Your Cart");
    }

    // Actions
    public int getCartItemCount() {

        return driver.findElements(cartItems)
                .size();
    }

    public void clickCheckout() {

        click(checkoutButton);
    }
}
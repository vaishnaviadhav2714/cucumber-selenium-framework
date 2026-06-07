package com.saucedemo.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.saucedemo.automation.constants.FrameworkConstants;

public class BasePage {

    protected WebDriver driver;
    
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement waitForVisibility(By locator) {
        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(FrameworkConstants.EXPLICIT_WAIT));
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void click(By locator) {
        waitForVisibility(locator);
        driver.findElement(locator).click();
    }

    protected void type(By locator, String text) {

        WebElement element =
                waitForVisibility(locator);

        element.clear();

        element.sendKeys(text);
    }

    protected String getText(By locator) {

        return waitForVisibility(locator).getText();
    }

    protected boolean isDisplayed(By locator) {

        return waitForVisibility(locator).isDisplayed();
    }

    protected String getPageTitle() {

        return driver.getTitle();
    }

    protected String getCurrentUrl() {

        return driver.getCurrentUrl();
    }
}
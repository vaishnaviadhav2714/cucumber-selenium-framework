package com.saucedemo.automation.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.saucedemo.automation.constants.FrameworkConstants;

public class WaitUtils {

    public static void waitForElementVisible(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver,
                Duration.ofSeconds(FrameworkConstants.EXPLICIT_WAIT));

        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForElementClickable(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver,
                Duration.ofSeconds(FrameworkConstants.EXPLICIT_WAIT));

        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
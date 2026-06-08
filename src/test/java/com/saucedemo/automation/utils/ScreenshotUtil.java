package com.saucedemo.automation.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

    public static String captureScreenshot(WebDriver driver, String scenarioName) {

        String screenshotPath = System.getProperty("user.dir")
                + "/target/screenshots/"
                + scenarioName.replaceAll("[^a-zA-Z0-9]", "_")
                + ".png";

        File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            Files.createDirectories(new File(System.getProperty("user.dir")
                    + "/target/screenshots").toPath());

            Files.copy(sourceFile.toPath(),
                    new File(screenshotPath).toPath(),
                    StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return screenshotPath;
    }
}
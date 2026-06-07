package com.saucedemo.automation.hooks;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.saucedemo.automation.factory.DriverFactory;
import com.saucedemo.automation.reports.ExtentTestManager;
import com.saucedemo.automation.utils.ConfigReader;
import com.saucedemo.automation.utils.ExtentManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    private ExtentReports extent;
    private ExtentTest test;
     
    @Before
    public void setUp(Scenario scenario) {

        DriverFactory.initializeDriver(ConfigReader.getBrowser());

        DriverFactory.getDriver().get(ConfigReader.getBaseUrl());

        extent = ExtentManager.getExtentReports();
        test = extent.createTest(scenario.getName());

        ExtentTestManager.setTest(test);
    }
    
    @After
    public void tearDown(Scenario scenario) {

        ExtentTest test = ExtentTestManager.getTest();

        if (test != null) {
            if (scenario.isFailed()) {
                test.fail("Scenario Failed");
            } else {
                test.pass("Scenario Passed");
            }
        }

        DriverFactory.quitDriver();

        if (extent != null) {
            extent.flush();
        }
    }
}
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
	  private static ExtentReports extent;
	  private ExtentTest test;
	  @Before
	    public void setUp() {
	        DriverFactory.initializeDriver();
	        DriverFactory.getDriver()
	            .get(ConfigReader.getBaseUrl());
	        extent = ExtentManager.getExtentReports();
	        test = extent.createTest("Scenario Execution");

	        ExtentTestManager.setTest(test);
	    }

	  @After
	  public void tearDown(Scenario scenario) {

	      if (scenario.isFailed()) {
	          ExtentTestManager.getTest().fail("Scenario Failed");
	      } else {
	          ExtentTestManager.getTest().pass("Scenario Passed");
	      }

	      DriverFactory.quitDriver();
	      extent.flush();
	  }
	}
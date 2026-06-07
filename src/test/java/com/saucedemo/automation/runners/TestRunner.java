package com.saucedemo.automation.runners;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.saucedemo.automation.factory.DriverFactory;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {
                "com.saucedemo.automation.stepdefinitions",
                "com.saucedemo.automation.hooks"
        },
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber.json"
        },
        monochrome = true,
        dryRun = false
)
public class TestRunner extends AbstractTestNGCucumberTests {
	
}
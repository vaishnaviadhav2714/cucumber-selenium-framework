package com.saucedemo.automation.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getExtentReports() {

        if (extent == null) {

            ExtentSparkReporter spark =
                    new ExtentSparkReporter("target/extent-report.html");

            extent = new ExtentReports();
            extent.attachReporter(spark);

            extent.setSystemInfo("Project", "SauceDemo Automation");
            extent.setSystemInfo("Tester", "Your Name");
        }

        return extent;
    }
}
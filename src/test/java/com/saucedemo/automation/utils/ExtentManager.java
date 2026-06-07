package com.saucedemo.automation.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getExtentReports() {

        if (extent == null) {

            String reportPath = System.getProperty("user.dir") 
                    + "/target/extent-report.html";

            ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);

            extent = new ExtentReports();
            extent.attachReporter(spark);

            extent.setSystemInfo("Project", "SauceDemo UI Automation Framework");
            extent.setSystemInfo("Tester Name", "Vaishnavi Adhav");
            extent.setSystemInfo("Framework", "Selenium + Cucumber + TestNG");
            
        }

        return extent;
    }

    public static void flushReports() {
        if (extent != null) {
            extent.flush();
        }
    }
}
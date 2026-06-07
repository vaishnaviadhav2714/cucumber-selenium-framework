package com.saucedemo.automation.factory;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.saucedemo.automation.utils.ConfigReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	// create driver variable
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	private DriverFactory() {
		
	}
	public static void initializeDriver() {

	    String browser = ConfigReader.getBrowser();

	    if (browser.equalsIgnoreCase("chrome")) {

	        WebDriverManager.chromedriver().setup();
	        ChromeOptions options = new ChromeOptions();
	        Map<String, Object> prefs = new HashMap<>();
	        prefs.put("credentials_enable_service", false);
	        prefs.put("profile.password_manager_enabled", false);
            options.setExperimentalOption("prefs", prefs);
	        options.addArguments("--incognito");
	        driver.set(new ChromeDriver(options));
	        getDriver().manage().window().maximize();
	        getDriver().manage().deleteAllCookies();
	    }
	}
	
	  public static WebDriver getDriver() {
		 return driver.get();
		}
	   
	   public static void quitDriver() {
		   if(getDriver()!= null){
			   getDriver().quit();
			   driver.remove();   
		   }
	   }
}

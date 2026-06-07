package com.saucedemo.automation.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.saucedemo.automation.constants.FrameworkConstants;

public class ConfigReader {
	
	private static Properties properties;    
	
	static {
		properties = new Properties();     // to create empty Properties object
	
	try {
		FileInputStream fileInputStream = new FileInputStream(FrameworkConstants.CONFIG_FILE_PATH);
		properties.load(fileInputStream);
		
	}catch(IOException e) {
		throw new RuntimeException("Failed to load configuration file");
		
	}
  }
	// Constructor
	private ConfigReader() {
	}
	
	public static String getBrowser() {
		return properties.getProperty("browser");
		
	 }
	public static String getBaseUrl() {
		return properties.getProperty("baseUrl");
	}	
	public static String getUsername(){
		return properties.getProperty("username");
	}
	public static String getPassword(){
		return properties.getProperty("password");
	}
	public static String getProperty(String key) {
	    return properties.getProperty(key);
	}	
	

}

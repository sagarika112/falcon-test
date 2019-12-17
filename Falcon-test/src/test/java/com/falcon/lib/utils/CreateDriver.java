package com.falcon.lib.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateDriver {

	public static WebDriver getBrowserInstance()
	{
		
		WebDriver driver=null;
		String browser=DataHandlers.getDataFromProperties("configuration", "browser1");
		String url=DataHandlers.getDataFromProperties("configuration", "url1");
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./browser-server/chromedriver.exe");
			driver=new ChromeDriver();
			
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./browser-server/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			System.err.println("....invalid browser option,check configuration.properties file+"
					+ "n config-data folder..");
		
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 if(url.equalsIgnoreCase("prod"))
		 {
			 driver.get("http://demo.actitime.com");
		 }
		 else
		 {
			 driver.get("http://localhost");
		 }
		 return driver;
	}
	
}

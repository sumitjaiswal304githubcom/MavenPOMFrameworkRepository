package com.framework.globalutility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods {
	
	public static WebDriver startapplication(WebDriver driver,String browserName,String appUrl)
	{
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.EAGER);
			driver = new ChromeDriver();			
		}
		else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
			driver = new FirefoxDriver();				
		}
		
//		driver.manage().timeouts().pageLoadTimeout(PageloadStartegy);
		driver.manage().window().maximize();
		driver.get(appUrl);		
		return driver;
	}
	
	public static void quiteBrowser(WebDriver driver)
	{
		driver.quit();
	}

}

//For the Mozilla version above 47, the geckodriver is used due to the presence of Marionette, 
//which is the driver for automation in Mozilla. 

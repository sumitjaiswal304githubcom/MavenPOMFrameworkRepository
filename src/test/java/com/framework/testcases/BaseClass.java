package com.framework.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.framework.globalutility.CommonMethods;
import com.framework.globalutility.ConfigDataProvider;
import com.framework.globalutility.Helper;

public class BaseClass {
	
public WebDriver driver;
public ConfigDataProvider config;

    @BeforeSuite
    public void setUpSuite()
    {
    	try 
    	{
			config = new ConfigDataProvider();
		} 
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    }
	
	@BeforeClass
	public void SetUp()
	{
		driver = CommonMethods.startapplication(driver,config.getBrowser(),config.getUrl());	
	}
	
	@AfterClass
	public void CleanUp()
	{
		CommonMethods.quiteBrowser(driver);		
	}
	
	//This will run after each test (Test case)
	@AfterMethod
	public void tearDownMethod(ITestResult result) throws Exception
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Helper.captureScreenshot(driver,result.getMethod());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			Helper.captureScreenshot(driver,result.getMethod());
		}
		
	}
	

}



















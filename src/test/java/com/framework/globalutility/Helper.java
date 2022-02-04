package com.framework.globalutility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestNGMethod;

public class Helper {
			
	public static void captureScreenshot(WebDriver driver, ITestNGMethod testName) throws Exception
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String currentDateTime = getCurrentDateTime();
//		String specificScreenshotName = currentDateTime + testName;
//		System.out.println(specificScreenshotName);
		
		try 
		{
			FileHandler.copy(src, new File("Screenshots/" + getCurrentDateTime() + ".png"));
		} 
		catch (Exception e) 
		{
			throw e;
		}
	}
	
	public static String getCurrentDateTime()
	{
		DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy HH_mm_ss");
		
		Date currentDate = new Date();
		
		return customFormat.format(currentDate);
	}

}

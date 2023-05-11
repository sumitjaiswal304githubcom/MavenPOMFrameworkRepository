package com.framework.testcases;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import com.framework.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import com.framework.globalutility.JsonDataProvider;

public class LoginTest extends BaseClass{
	
	//https://www.youtube.com/watch?v=EZJiW5oM2Ks	
	
	//https://www.youtube.com/watch?v=RvwMu7tG6TA
	
	@Test
	public void LoginApp() throws Throwable 
	{	
		try 
		{
			JSONObject object = JsonDataProvider.JsonDataProviderMethod();
			
			String fullName = (String)object.get("FullName");
			String city = (String)object.get("City");
			
			HomePage homePage = PageFactory.initElements(driver, HomePage.class);		
			homePage.createAccount(fullName,city);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Excpetion occurred in LoginAppMethod "+ e.getMessage());
			e.printStackTrace();
		}						
	}
			

}

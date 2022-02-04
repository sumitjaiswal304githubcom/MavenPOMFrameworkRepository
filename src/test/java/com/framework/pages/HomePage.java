package com.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver ldriver)
	{
		this.driver = ldriver; 
	}
	
	@FindBy(linkText="Create Account") WebElement createAccountWebEle;
	
	@FindBy(xpath="//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input") WebElement fullNameWebEle;
	
	@FindBy(xpath="//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]") WebElement femaleRadioWebEle;
	
	@FindBy(xpath="//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select") WebElement cityWebEle;
	
	public void createAccount(String fullName,String city) throws Throwable
	{
		createAccountWebEle.click();
		fullNameWebEle.sendKeys(fullName);
		femaleRadioWebEle.click();
		cityWebEle.sendKeys(city);		
	}
	
	

}

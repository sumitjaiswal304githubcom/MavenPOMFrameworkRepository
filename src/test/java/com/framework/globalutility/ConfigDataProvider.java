package com.framework.globalutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	
	public ConfigDataProvider() throws Exception
	{
		File src = new File("./Config/Config.properties");		
		FileInputStream iStream = new FileInputStream(src);
		
		pro=new Properties();		
		pro.load(iStream);
	}
	
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	
	public String getUrl()
	{
		return pro.getProperty("Url");
	}

}

package com.framework.globalutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties prop;
	
	public ConfigDataProvider() throws Exception
	{
		File src = new File("./Config/Config.properties");		
		FileInputStream iStream = new FileInputStream(src);
		
		prop=new Properties();		
		prop.load(iStream);
	}
	
	public String getBrowser()
	{
		return prop.getProperty("Browser");
	}
	
	public String getUrl()
	{
		return prop.getProperty("Url");
	}

}

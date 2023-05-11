package com.framework.globalutility;
import java.io.FileReader;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;

public class JsonDataProvider {
	
	static String systemPath = System.getProperty("user.dir");
	
	public static JSONObject JsonDataProviderMethod()
	{
		JSONParser parser = new JSONParser();
		
		try 
		{
			Object obj = parser.parse(new FileReader(systemPath + "//TestData//TestData.json"));
			JSONObject jobj = (JSONObject)obj;	
			String name = (String) jobj.get("Name");
			return jobj;					    
		}
		catch(Exception ex)
		{
			
		}
		return null;				
	}

}

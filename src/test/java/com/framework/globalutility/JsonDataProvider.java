package com.framework.globalutility;
import java.io.FileReader;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;

public class JsonDataProvider {
	
	public static JSONObject JsonDataProviderMethod()
	{
		JSONParser parser = new JSONParser();
		
		try 
		{
			Object obj = parser.parse(new FileReader("C:\\Personal\\EclipseWorkspace\\MavenPOMFramework\\TestData\\TestData.json"));
			JSONObject jobj = (JSONObject)obj;			
			return jobj;
		}
		catch(Exception ex)
		{
			
		}
		return null;				
	}

}

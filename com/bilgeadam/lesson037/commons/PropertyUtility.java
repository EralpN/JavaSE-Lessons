package com.bilgeadam.lesson037.commons;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtility
{
	// reads .property files
	public static Properties readProperties(String filePath)
	{
		Properties properties = new Properties();
		
		try (InputStream input = new FileInputStream(filePath))
		{
			properties.load(input);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		return properties;
	}
}

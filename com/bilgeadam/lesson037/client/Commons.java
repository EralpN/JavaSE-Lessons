package com.bilgeadam.lesson037.client;

import java.util.Properties;

import com.bilgeadam.lesson037.commons.PropertyUtility;

public class Commons
{
	
	private static Commons instance;
	
	private Properties clientProperties;

	private String clientPropertiesPath;
	
	
	private Commons()
	{
		super();
		clientProperties = null; // Resets properties if necessary
	}
	
	public static Commons getInstance()
	{
		if (instance == null)
		{
			instance = new Commons();
		}
		return instance;
	}
	
	public String getServerAddress()
	{
		return this.getClientProperties().getProperty("server");
	}
	
	public int getPortNumber()
	{
		String port = this.getClientProperties().getProperty("port");
		return Integer.parseInt(port);
	}

	private Properties getClientProperties()
	{
		if (this.clientProperties == null)
		{
			this.clientProperties = PropertyUtility.readProperties(this.clientPropertiesPath);
		}
		return this.clientProperties;
	}

	public void setArguments(String args)
	{
		this.clientPropertiesPath = args;	
	}
	
	
	
}

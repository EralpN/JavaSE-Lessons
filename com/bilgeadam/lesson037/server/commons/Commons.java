package com.bilgeadam.lesson037.server.commons;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.ResourceBundle;

import com.bilgeadam.lesson037.commons.PropertyUtility;

public class Commons
{

	private static Commons instance;

	private Properties serverProperties;

	private String serverPropertiesPath;

	private Commons()
	{
		super();
		serverProperties = null; // Resets properties if necessary
	}

	public static Commons getInstance()
	{
		if (instance == null)
		{
			instance = new Commons();
		}
		return instance;
	}

	public int getPortNumber()
	{
		String port = this.getServerProperties().getProperty("port");
		return Integer.parseInt(port);
	}

	private String getTranslationFilesName()
	{
		return this.getServerProperties().getProperty("translation_files_name");
	}

	private ResourceBundle getResourceBundle(String lang)
	{
		Locale locale = new Locale(lang);
		String bundleName = Commons.class.getPackageName() + "." + getTranslationFilesName();
		return ResourceBundle.getBundle(bundleName, locale);
	}

	public String getTranslation(String textToTranslate, String targetLanguage)
	{
		try
		{
			return this.getResourceBundle(targetLanguage).getString(textToTranslate);
		}
		catch (MissingResourceException e)
		{
			return "!" + textToTranslate + "!";
		}
	}

	private Properties getServerProperties()
	{
		if (this.serverProperties == null)
		{
			this.serverProperties = PropertyUtility.readProperties(this.serverPropertiesPath);
		}
		return this.serverProperties;
	}

	public void setArguments(String args)
	{
		this.serverPropertiesPath = args;
	}

}

package com.bilgeadam.lesson035.singleton;

public class Singleton
{
	private static Singleton instance = null;
	
	private Singleton()
	{
		super();
	}
	
	public static Singleton getInstance()
	{
		if (instance == null)
		{
			instance = new Singleton();
		}
		return instance; 
	}
	
}

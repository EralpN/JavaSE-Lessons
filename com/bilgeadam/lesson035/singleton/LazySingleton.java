package com.bilgeadam.lesson035.singleton;

public class LazySingleton
{
	// created when necessary, works in single thread environment
	private static LazySingleton instance = null;
	
	private LazySingleton()
	{
		super();
	}
	
	public static LazySingleton getInstance()
	{
		if (instance == null)
		{
			instance = new LazySingleton();
		}
		return instance; 
	}
	
}

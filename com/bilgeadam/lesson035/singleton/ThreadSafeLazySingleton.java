package com.bilgeadam.lesson035.singleton;

public class ThreadSafeLazySingleton
{
	// created when necessary, works in multiple thread environment
	private static ThreadSafeLazySingleton instance = null;
	
	private ThreadSafeLazySingleton()
	{
		super();
	}
	
	public static synchronized ThreadSafeLazySingleton getInstance()
	{
		if (instance == null)
		{
			instance = new ThreadSafeLazySingleton();
		}
		return instance; 
	}
	
}

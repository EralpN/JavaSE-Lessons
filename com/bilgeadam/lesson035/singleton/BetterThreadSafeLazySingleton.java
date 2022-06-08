package com.bilgeadam.lesson035.singleton;

public class BetterThreadSafeLazySingleton
{
	// created when necessary, works in multiple thread environment
	private static BetterThreadSafeLazySingleton instance = null;
	
	private BetterThreadSafeLazySingleton()
	{
		super();
	}
	
	// synchronized is costly, this way it is never used again after first use
	public static BetterThreadSafeLazySingleton getInstance()
	{
		if (instance == null)
		{
			synchronized (BetterThreadSafeLazySingleton.class)
			{
				if (instance == null)
				{
				instance = new BetterThreadSafeLazySingleton();
				}
			}
		}
		return instance; 
	}
	
}

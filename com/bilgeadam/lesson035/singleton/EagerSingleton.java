package com.bilgeadam.lesson035.singleton;

public class EagerSingleton
{
	// created even when unnecessary
	private static final EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton()
	{
		super();
	}
	
	public static EagerSingleton getInstance()
	{
		return instance;
	}
}

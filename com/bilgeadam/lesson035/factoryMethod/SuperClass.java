package com.bilgeadam.lesson035.factoryMethod;

public abstract class SuperClass
{
	String name;

	abstract void assignName();

	public void presentName()
	{
		System.out.println(name);
	}
}

package com.bilgeadam.lesson035.factoryMethod;

public class Factory
{
	public static SuperClass getSuperClass(String type) throws NoClassException
	{
		if (type.equalsIgnoreCase("1"))
		{
			return new SubClass1();
		}
		if (type.equalsIgnoreCase("2"))
		{
			return new SubClass2();
		}
		if (type.equalsIgnoreCase("3"))
		{
			return new SubClass3();
		}
		throw new NoClassException("Class does not exist!");
	}
}

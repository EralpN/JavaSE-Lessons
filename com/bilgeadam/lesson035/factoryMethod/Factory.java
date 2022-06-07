package com.bilgeadam.lesson035.factoryMethod;

public class Factory
{
	public SuperClass getSuperClass(String type)
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
		return null;
	}
}

package com.bilgeadam.lesson036.abstractFactoryMethod.num;
import com.bilgeadam.lesson036.abstractFactoryMethod.AbstractFactory;
import com.bilgeadam.lesson036.abstractFactoryMethod.NoClassException;

public class FactoryNum extends AbstractFactory
{
	public SuperClassNum create(String type) throws NoClassException
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

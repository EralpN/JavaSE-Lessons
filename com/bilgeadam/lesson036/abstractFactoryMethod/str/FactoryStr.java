package com.bilgeadam.lesson036.abstractFactoryMethod.str;
import com.bilgeadam.lesson036.abstractFactoryMethod.AbstractFactory;
import com.bilgeadam.lesson036.abstractFactoryMethod.NoClassException;

public class FactoryStr extends AbstractFactory
{
	public SuperClassStr create(String type) throws NoClassException
	{
		if (type.equalsIgnoreCase("A"))
		{
			return new SubClassA();
		}
		if (type.equalsIgnoreCase("B"))
		{
			return new SubClassB();
		}
		if (type.equalsIgnoreCase("C"))
		{
			return new SubClassC();
		}
		throw new NoClassException("Class does not exist!");
	}
}

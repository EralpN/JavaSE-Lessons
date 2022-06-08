package com.bilgeadam.lesson036.abstractFactoryMethod;

import com.bilgeadam.lesson036.abstractFactoryMethod.num.FactoryNum;
import com.bilgeadam.lesson036.abstractFactoryMethod.str.FactoryStr;

public class FactoryProducer
{
	public static AbstractFactory produce(String factoryType) throws NoClassException
	{
		if (factoryType.equalsIgnoreCase("Num"))
		{
			return new FactoryNum();
		}
		if (factoryType.equalsIgnoreCase("Str"))
		{
			return new FactoryStr();
		}
		throw new NoClassException("Factory does not exist!");
	}
}

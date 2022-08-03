package com.bilgeadam.lesson036.abstractFactoryMethod.str;

import com.bilgeadam.lesson036.abstractFactoryMethod.Createable;

public abstract class SuperClassStr implements Createable
{
	String name;

	@Override
	public abstract void assignName();

	@Override
	public void presentName()
	{
		System.out.println(name);
	}
}

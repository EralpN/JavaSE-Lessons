package com.bilgeadam.lesson036.abstractFactoryMethod.num;

import com.bilgeadam.lesson036.abstractFactoryMethod.Createable;

public abstract class SuperClassNum implements Createable
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

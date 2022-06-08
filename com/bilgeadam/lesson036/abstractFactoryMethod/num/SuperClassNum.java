package com.bilgeadam.lesson036.abstractFactoryMethod.num;

import com.bilgeadam.lesson036.abstractFactoryMethod.Createable;

public abstract class SuperClassNum implements Createable
{
	String name;

	public abstract void assignName();

	public void presentName()
	{
		System.out.println(name);
	}
	
	@Override
	public String info()
	{
		return "Num";
	}
}

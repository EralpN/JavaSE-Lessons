package com.bilgeadam.lesson018;

public abstract class Person
{
	protected String name;
	protected int age;
	protected boolean isHealty;
	
	public Person(String name, int age, boolean isHealty)
	{
		this.name = name;
		this.age = age;
		this.isHealty = isHealty;
	}

	
	
	
	protected abstract void operation();	
}

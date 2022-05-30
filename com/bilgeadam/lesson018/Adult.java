package com.bilgeadam.lesson018;

public class Adult extends Person
{

	public Adult(String name, int age, boolean isHealty)
	{
		super(name, age, isHealty);
	}

	@Override
	protected void operation()
	{
		if (isHealty)
		{
			System.out.println(name + " " + age + " is healty, performing checkup.");
		}
		else
		{
			System.out.println(name + " " + age + " is not healty, performing examination.");
			System.out.println("Giving prescription for drugs.");
		}
	}

}

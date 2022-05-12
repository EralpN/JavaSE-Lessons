package com.bilgeadam.lesson018.practice;

public class Child extends Person
{

	private boolean isVaccinated;
	
	public Child(String name, int age, boolean isHealty, boolean isVaccinated)
	{
		super(name, age, isHealty);
		this.isVaccinated = isVaccinated;
	}

	
	
	
	
	
	@Override
	protected void operation()
	{
		if (isHealty)
		{
			System.out.println(name + " " + age + " is healty, performing checkup.");
			vaccinate();
		}
		else
		{
			System.out.println(name + " " + age + " is not healty, performing examination.");
			System.out.println("Giving prescription for drugs.");
			vaccinate();
		}
	}
	
	private void vaccinate()
	{
		if (isVaccinated)
		{
			System.out.println(name + " " + age + " is already vaccinated.");
		}
		else
		{
			System.out.println(name + " " + age + " is not vaccinated, performing vaccination.");
		}
	}
	
}

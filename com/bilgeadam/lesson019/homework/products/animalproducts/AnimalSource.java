package com.bilgeadam.lesson019.homework.products.animalproducts;

public enum AnimalSource
{
	BEE("Bees"), COW("Cows");
	
	private String name;
	
	AnimalSource(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
}

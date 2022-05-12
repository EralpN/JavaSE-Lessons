package com.bilgeadam.lesson019.homework.products.animalproducts;

public enum HoneyType
{
	PINE("Pine Honey"), FLOWER("Flower Honey"), CHESTNUT("Chestnut Honey");
	
	private String name;
	
	HoneyType(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
}

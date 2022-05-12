package com.bilgeadam.lesson019.homework.products;

public enum ProductType
{
	ANIMAL_PRODUCT("Animal Product"), 
	HERBAL_PRODUCT("Herbal Product"), 
	TOOL_PRODUCT("Tools"), 
	CLEANING_PRODUCT("Cleaning Product");
	
	
	private String name;
	
	ProductType(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	
}

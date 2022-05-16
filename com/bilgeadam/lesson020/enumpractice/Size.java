package com.bilgeadam.lesson020.enumpractice;

public enum Size
{
	SMALL,
	MEDIUM,
	LARGE;
	
	
	
	public String getSize()
	{
		switch (this)
		{
		case SMALL:
			return "Small Pizza!";
		case MEDIUM:
			return "Medium Pizza!";
		case LARGE:
			return "Large Pizza!";
		default:
			return "Error";
		}
		
	}
	
	
	
	
}

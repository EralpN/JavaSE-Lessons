package com.bilgeadam.lesson028;

public enum FurnitureSet
{
	GARDEN("Garden furniture"), KIDS("Kids room furniture"), LIVING_ROOM("Living room furniture");

	String set;
	
	FurnitureSet(String set)
	{
		this.set = set;
	}
	
	public String getSetName()
	{
		return this.set;
	}
	
	public void isWaterResistant()
	{
		if (this.set.equals(FurnitureSet.GARDEN.getSetName()))
		{
			System.out.println("This furniture is water resistant");
		}
		else
		{
			System.out.println("This furniture is not water resistant");
		}
	}
}

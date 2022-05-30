package com.bilgeadam.lesson028;

import java.time.LocalDate;

public abstract class Furniture
{
	
	private FurnitureSet set;
	private Material material;
	private LocalDate purchaseDate;
	
	public Furniture(FurnitureSet set, Material material, LocalDate purchaseDate)
	{
		this.set = set;
		this.material = material;
		this.purchaseDate = purchaseDate;
	}
	
	public String getSetName()
	{
		return this.set.getSetName();
	}
	
	public String getMaterialName()
	{
		return this.material.getMaterialName();
	}
	
	public FurnitureSet getSet()
	{
		return this.set;
	}

	public Material getMaterial()
	{
		return this.material;
	}

	public LocalDate getPurchaseDate()
	{
		return this.purchaseDate;
	}

}

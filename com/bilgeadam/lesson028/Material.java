package com.bilgeadam.lesson028;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public enum Material
{
WOOD("Wood"),
PLASTIC("Plastic");
	
	String material;
	
	Material(String material)
	{
		this.material = material;
	}
	
	public String getMaterialName()
	{
		return this.material;
	}
	
	public void maintnanceDate(LocalDate datePurchased)
	{
		if (this.material.equals("Plastic"))
		{
			System.out.println("Plastic furniture does not require maintnance.");
		}
		else
		{
		LocalDate maintnanceDate = null;
		long monthsInBetween = datePurchased.until(LocalDate.now(), ChronoUnit.MONTHS);
		maintnanceDate = datePurchased.plusMonths(monthsInBetween + 1);
		System.out.println("Next maintnance date: " + maintnanceDate.toString());
		}
	}
}

package com.bilgeadam.lesson019.model.product;

import java.time.LocalDate;

public class Asset
{

	private double purchasePrice;
	private int numberOwned;
	private String name;
	private  LocalDate purhaseDate;
	
	
	
	
	public Asset()
	{
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString()
	{
		return "Asset [purchasePrice=" + this.purchasePrice + ", numberOwned=" + this.numberOwned + ", name="
				+ this.name + ", purhaseDate=" + this.purhaseDate + "]";
	}

	
}

package com.bilgeadam.lesson019.homework.products;

import java.time.LocalDateTime;

import com.bilgeadam.lesson019.homework.Products;

public abstract class HerbalProducts extends Products implements CanRot
{

	private int timeToRot = 15;
	
	public HerbalProducts(ProductType productType, LocalDateTime productArrivalDate, double price, int numberInStock)
	{
		super(productType, productArrivalDate, price, numberInStock);
	}

	@Override
	public void isRotten()
	{
		if (timeOnShelf > timeToRot)
		{
			System.out.println("This product is rotten.");
		}
		else
		{
			System.out.println("This product is fresh.");
		}
	}

}

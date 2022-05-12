package com.bilgeadam.lesson019.homework.products;

import java.time.LocalDateTime;

import com.bilgeadam.lesson019.homework.Products;

public abstract class CleaningProducts extends Products implements CanWholesale
{
	private boolean isNatural;
	
	public CleaningProducts(ProductType productType, LocalDateTime productArrivalDate, double price, int numberInStock, boolean isNatural)
	{
		super(productType, productArrivalDate, price, numberInStock);
		this.isNatural = isNatural;
	}

	public boolean isNatural()
	{
		return isNatural;
	}

	
	
	@Override
	public void sell(int numberToBeSold)
	{
		System.out.println("Trying to sell " + numberToBeSold + " out of " + numberInStock);
		if (numberToBeSold > numberInStock)
		{
			System.out.println("Insufficient stock.");
		}
		else
		{
		this.numberInStock -= numberToBeSold;
		if (numberToBeSold > 19)
		{
			System.out.println("More than 20 products requested! This is a wholesale, 15% off!");
			System.out.println("Sold " + numberToBeSold + " items for " + (canWholesale() * numberToBeSold));
		}
		else
		{
		System.out.println("Sold " + numberToBeSold + " items for " + (price * numberToBeSold));
		}
		}
	}
	
	
	@Override
	public double canWholesale()
	{
		return this.price * (1 - 0.15);
	}


}

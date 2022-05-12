package com.bilgeadam.lesson019.homework;

import java.time.Duration;
import java.time.LocalDateTime;

import com.bilgeadam.lesson019.homework.products.ProductType;

public abstract class Products
{

	protected ProductType productType;
	protected LocalDateTime productArrivalDate;
	protected double timeOnShelf;
	protected double price;
	protected int numberInStock;
	
	
	public Products(ProductType productType, LocalDateTime productArrivalDate, double price, int numberInStock)
	{
		this.productType = productType;
		this.productArrivalDate = productArrivalDate;
		this.price = price;
		this.numberInStock = numberInStock;
		timeOnShelf();
	}

	
	protected void timeOnShelf()
	{
		Duration time = Duration.between(productArrivalDate, LocalDateTime.now());
		this.timeOnShelf = time.toDays();
	}




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
		System.out.println("Sold " + numberToBeSold + " items for " + (price * numberToBeSold));
		}
	}
	
	
	
	public double getPrice()
	{
		return this.price;
	}


	public void setPrice(double price)
	{
		this.price = price;
	}


	public int getNumberInStock()
	{
		return this.numberInStock;
	}


	public void setNumberInStock(int numberInStock)
	{
		this.numberInStock = numberInStock;
	}
	
}

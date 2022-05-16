package com.bilgeadam.lesson020.superpractice;

public abstract class Products
{
	private String name;
	private double price;

	public Products(String name, double price)
	{
		this.name = name;
		this.price = price;
	}

	public abstract double endPrice(double discountRate); 
	
	
	public String getName()
	{
		return this.name;
	}

	public double getPrice()
	{
		return this.price;
	}



	@Override
	public String toString()
	{
		return "Products [name=" + this.name + ", price=" + this.price + "]";
	}


}

package com.bilgeadam.lesson020.superpractice;

public class Stationary extends Products
{
	private String color;

	
	public Stationary(String name, double price, String color)
	{
		super(name, price);
		this.color = color;
	}

	@Override
	public double endPrice(double discountRate)
	{
		return getPrice() * ((100 - discountRate) / 100);
	}

	public String getColor()
	{
		return this.color;
	}


	@Override
	public String toString()
	{
		return "Stationary [color=" + this.color + ", toString()=" + super.toString() + "]";
	}



	
}

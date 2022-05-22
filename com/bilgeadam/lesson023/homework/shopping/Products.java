package com.bilgeadam.lesson023.homework.shopping;

public class Products
{
	private Product product;
	private int amount;
	
	public Products (Product product, int amount)
	{
		this.product = product;
		this.amount = amount;
	}

	public Product getProduct()
	{
		return this.product;
	}

	public int getAmount()
	{
		return this.amount;
	}
	
	public double getUnitPrice()
	{
		return this.product.getPrice();
	}
	
	public double getTotalPrice()
	{
		return this.product.getPrice() * this.amount;
	}
}

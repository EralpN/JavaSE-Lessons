package com.bilgeadam.lesson019.model.product;

import java.time.LocalDate;

public abstract class Product
{

	protected double purchasePrice;
	protected String name;
	protected LocalDate purchaseDate;
	protected int stockedAmount;
	
	public Product(String name, double purchasePrice, LocalDate purchaseDate, int stockedAmount)
	{
		super();
	}

	protected abstract double calcEndPrice(double discountRate);

}
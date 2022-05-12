package com.bilgeadam.lesson019.model.product;

import java.time.LocalDate;

public class GoodsForSale extends Product implements Sellable
{

	private double sellPrice;
	private String unit;
	private double endPrice;
	
	public GoodsForSale(String name, double purchasePrice, LocalDate purchaseDate, int stockedAmount)
	{
		super(name, purchasePrice, purchaseDate, stockedAmount);
	}


	@Override
	public double calcEndPrice(double discountRate)
	{
		return this.sellPrice * (1 - discountRate);
	}

	@Override
	public void sell(int sellingAmount)
	{
		endPrice = this.calcEndPrice(0.2);
		this.stockedAmount -= sellingAmount;
		notifySell();
	}


	@Override
	public String toString()
	{
		return "GoodsForSale [sellPrice=" + this.sellPrice + ", unit=" + this.unit + ", endPrice=" + this.endPrice
				+ ", toString()=" + super.toString() + "]";
	}


	
	
	
	
}

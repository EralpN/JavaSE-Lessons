package com.bilgeadam.lesson019.model.product;

public interface Sellable
{
	
	int price = 0;
	double calcEndPrice(double discountRate);
	void sell(int sellingAmount);
	
	default void notifySell()
	{
		System.out.println("Product sold.");
	}
	
	
}

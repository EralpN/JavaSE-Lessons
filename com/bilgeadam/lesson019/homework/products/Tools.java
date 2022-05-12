package com.bilgeadam.lesson019.homework.products;

import java.time.LocalDateTime;

import com.bilgeadam.lesson019.homework.Products;

public abstract class Tools extends Products
{

	public Tools(ProductType productType, LocalDateTime productArrivalDate, double price, int numberInStock)
	{
		super(productType, productArrivalDate, price, numberInStock);
	}

	

}

package com.bilgeadam.lesson019.homework.products.toolproducts;

import java.time.LocalDateTime;

import com.bilgeadam.lesson019.homework.products.ProductType;
import com.bilgeadam.lesson019.homework.products.Tools;

public class Screwdriver extends Tools
{

	public Screwdriver(ProductType productType, LocalDateTime productArrivalDate, double price, int numberInStock)
	{
		super(productType, productArrivalDate, price, numberInStock);
	}



}

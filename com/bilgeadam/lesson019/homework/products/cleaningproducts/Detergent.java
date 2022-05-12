package com.bilgeadam.lesson019.homework.products.cleaningproducts;

import java.time.LocalDateTime;

import com.bilgeadam.lesson019.homework.products.CleaningProducts;
import com.bilgeadam.lesson019.homework.products.ProductType;

public class Detergent extends CleaningProducts
{

	public Detergent(ProductType productType, LocalDateTime productArrivalDate, double price, int numberInStock, boolean isNatural)
	{
		super(productType, productArrivalDate, price, numberInStock, isNatural);
	}




}

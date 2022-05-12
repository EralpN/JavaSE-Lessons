package com.bilgeadam.lesson019.homework.products.herbalproducts;

import java.time.LocalDateTime;

import com.bilgeadam.lesson019.homework.products.HerbalProducts;
import com.bilgeadam.lesson019.homework.products.ProductType;

public class Potato extends HerbalProducts
{

	public Potato(ProductType productType, LocalDateTime productArrivalDate, double price, int numberInStock)
	{
		super(productType, productArrivalDate, price, numberInStock);
	}



}

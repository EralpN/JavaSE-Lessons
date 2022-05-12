package com.bilgeadam.lesson019.homework.products.animalproducts;

import java.time.LocalDateTime;

import com.bilgeadam.lesson019.homework.products.AnimalProducts;
import com.bilgeadam.lesson019.homework.products.ProductType;

public class Honey extends AnimalProducts
{

	private HoneyType honeyType;
	
	public Honey(ProductType productType, LocalDateTime productArrivalDate, double price, int numberInStock, AnimalSource animalSource, HoneyType honeyType)
	{
		super(productType, productArrivalDate, price, numberInStock, animalSource);
		this.honeyType = honeyType;
	}

	public HoneyType getHoneyType()
	{
		return this.honeyType;
	}





}

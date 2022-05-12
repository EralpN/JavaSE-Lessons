package com.bilgeadam.lesson019.homework.products;

import java.time.LocalDateTime;

import com.bilgeadam.lesson019.homework.Products;
import com.bilgeadam.lesson019.homework.products.animalproducts.AnimalSource;

public abstract class AnimalProducts extends Products
{
	protected AnimalSource animalSource;
	
	public AnimalProducts(ProductType productType, LocalDateTime productArrivalDate, double price, int numberInStock, AnimalSource animalSource)
	{
		super(productType, productArrivalDate, price, numberInStock);
		this.animalSource = animalSource;
	}



	public AnimalSource getAnimalSource()
	{
		return this.animalSource;
	}

}

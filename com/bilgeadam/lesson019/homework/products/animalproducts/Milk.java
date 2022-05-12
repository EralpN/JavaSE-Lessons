package com.bilgeadam.lesson019.homework.products.animalproducts;

import java.time.LocalDateTime;

import com.bilgeadam.lesson019.homework.products.AnimalProducts;
import com.bilgeadam.lesson019.homework.products.CanRot;
import com.bilgeadam.lesson019.homework.products.ProductType;

public class Milk extends AnimalProducts implements CanRot
{
	
	private int timeToRot = 90;
	private int fatContent;
	
	public Milk(ProductType productType, LocalDateTime productArrivalDate, double price, int numberInStock, AnimalSource animalSource, int fatContent)
	{
		super(productType, productArrivalDate, price, numberInStock, animalSource);
		this.fatContent = fatContent;
	}

	
	
	@Override
	public void isRotten()
	{
		if (timeOnShelf > timeToRot)
		{
			System.out.println("This product is rotten.");
		}
		else
		{
			System.out.println("This product is fresh.");
		}
	}






	public int getFatContent()
	{
		return this.fatContent;
	}

}

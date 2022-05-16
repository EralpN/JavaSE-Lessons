package com.bilgeadam.lesson019.homework;

import java.time.LocalDateTime;

import com.bilgeadam.lesson019.homework.products.ProductType;
import com.bilgeadam.lesson019.homework.products.animalproducts.AnimalSource;
import com.bilgeadam.lesson019.homework.products.animalproducts.Milk;
import com.bilgeadam.lesson019.homework.products.cleaningproducts.Detergent;
import com.bilgeadam.lesson019.homework.products.herbalproducts.Potato;

public class Shop
{

	public static void main(String[] args)
	{
		Milk milk = new Milk(ProductType.ANIMAL_PRODUCT, LocalDateTime.of(2022, 5, 1, 0, 0), 15, 150, AnimalSource.COW, 5);
		System.out.println(milk.productType.getName());
		System.out.println("Time spent on shelf: " + milk.timeOnShelf);
		System.out.println("Price: " + milk.price);
		System.out.println("Initial Stock: " + milk.numberInStock);
		System.out.println("Animal source: " + milk.getAnimalSource().getName());
		System.out.println("Fat content: " + milk.getFatContent() + "%");
		milk.isRotten();
		milk.sell(30);
		milk.sell(200);
		
		System.out.println();
		System.out.println();
		
		Detergent detergent = new Detergent(ProductType.CLEANING_PRODUCT, LocalDateTime.of(2022, 5, 1, 0, 0), 80, 600, false);
		System.out.println(detergent.productType.getName());
		System.out.println("Time spent on shelf: " + detergent.timeOnShelf);
		System.out.println("Price: " + detergent.price);
		System.out.println("Initial Stock: " + detergent.numberInStock);
		System.out.println("Is it natural: " + detergent.isNatural());
		detergent.sell(30);
		detergent.sell(200);
		detergent.sell(1000);
		
		System.out.println();
		System.out.println();
		
		Potato potato = new Potato(ProductType.HERBAL_PRODUCT, LocalDateTime.of(2022, 4, 15, 0, 0), 5, 300);
		System.out.println(potato.productType.getName());
		System.out.println("Time spent on shelf: " + potato.timeOnShelf);
		System.out.println("Price: " + potato.price);
		System.out.println("Initial Stock: " + potato.numberInStock);
		milk.isRotten();
		milk.sell(30);
		milk.sell(200);
	}
}

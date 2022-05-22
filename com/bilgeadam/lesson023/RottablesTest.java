package com.bilgeadam.lesson023;

import java.time.LocalDateTime;

import com.bilgeadam.lesson019.homework.products.CanRot;
import com.bilgeadam.lesson019.homework.products.ProductType;
import com.bilgeadam.lesson019.homework.products.animalproducts.AnimalSource;
import com.bilgeadam.lesson019.homework.products.animalproducts.Milk;
import com.bilgeadam.lesson019.homework.products.herbalproducts.Potato;

public class RottablesTest
{

	public static void main(String[] args)
	{
		RottablesCache<CanRot> rottable = new RottablesCache<>();
		
		rottable.add(new Potato(ProductType.HERBAL_PRODUCT, LocalDateTime.of(2022, 5, 15, 0, 0), 50, 100));
		rottable.add(new Milk(ProductType.ANIMAL_PRODUCT, LocalDateTime.of(2022, 5, 1, 0, 0), 15, 150, AnimalSource.COW, 5));
		
		rottable.list();
	}

}

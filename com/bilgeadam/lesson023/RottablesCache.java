package com.bilgeadam.lesson023;

import java.util.ArrayList;

import com.bilgeadam.lesson019.homework.products.CanRot;

public class RottablesCache <T extends CanRot>
// RottablesCache is a class that can only take objects that can rot.
{
	private ArrayList<T> rottableProducts;
	
	public RottablesCache()
	{
		this.rottableProducts = new ArrayList<>();
	}

	public void add (T t)
	{
		this.rottableProducts.add(t);
	}
	
	public void list()
	{
		for (T t : rottableProducts)
		{
			System.out.println(t);
		}
	}

}

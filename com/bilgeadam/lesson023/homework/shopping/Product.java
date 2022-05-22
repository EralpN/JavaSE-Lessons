package com.bilgeadam.lesson023.homework.shopping;

public enum Product
{
	ChipsBig(9.5), Coke1Liter(12), Sugar1Kg(29.9), Olive1Kg(50), Milk1Liter(15.9), BreadBig(4.5), BlackTea1Kg(38.25), EggSingle(1.5), Yoghurt1Kg(22), Cheese1Kg(70);

	double price;
	
	Product(double price)
	{
		this.price = price;
	}

	public double getPrice()
	{
		return this.price;
	}
	
}

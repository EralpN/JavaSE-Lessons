package com.bilgeadam.lesson020.enumpractice;

public class Pizza
{

	Size pizzaSize;
	
	public Pizza(Size pizzaSize)
	{		
		this.pizzaSize = pizzaSize;
	}
	
	public void orderPizza()
	{
		switch (pizzaSize)
		{
		case SMALL:
			System.out.println("Small Pizza!");
			break;
		case MEDIUM:
			System.out.println("Medium Pizza!");
			break;
		case LARGE:
			System.out.println("Large Pizza!");
			break;
		default:
			System.err.println("Error");
			break;
		}
	}
}

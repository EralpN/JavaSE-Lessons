package com.bilgeadam.lesson020.enumpractice;

public class PizzaTest
{

	public static void main(String[] args)
	{
		Pizza pizza = new Pizza(Size.LARGE);
		
		System.out.println(pizza.pizzaSize.getSize());
		
		pizza.orderPizza();
		

	}

}

package com.bilgeadam.lesson020.superpractice;

public class Library
{

	public static void main(String[] args)
	{
		System.out.println("Welcome!");
		System.out.println();
		
		Book book1 = new Book("Red Book", 10, "John Doe", 1996);
		System.out.println(book1);
		
		System.out.println();
		
		Magazine magazine1 = new Magazine("NatGeo", 25, "National Geographic", 2021, 78);
		System.out.println(magazine1);
		System.out.println("Discounted price: " + magazine1.endPrice(50));
		
	}

}

package com.bilgeadam.lesson020.interfacepractice;

public class A4 implements Printable, Showable
{


	@Override
	public void print()
	{
		System.out.println("Printing A4.");
		
	}

	@Override
	public void show()
	{
		System.out.println("Showing A4.");
		
	}

}

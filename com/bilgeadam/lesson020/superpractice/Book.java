package com.bilgeadam.lesson020.superpractice;

public class Book extends Products
{
	private String author;
	private int year;
	
	public Book(String name, double price, String author, int year)
	{
		super(name, price);
		this.author = author;
		this.year = year;
		
	}

	@Override
	public double endPrice(double discountRate)
	{
		return this.getPrice() * ((100 - discountRate) / 100);
	}
	
	
	public String getAuthor()
	{
		return this.author;
	}

	public int getYear()
	{
		return this.year;
	}



	@Override
	public String toString()
	{
		return "Book [author=" + this.author + ", year=" + this.year + ", toString()=" + super.toString() + "]";
	}




	
	
}

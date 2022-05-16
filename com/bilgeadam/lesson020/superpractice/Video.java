package com.bilgeadam.lesson020.superpractice;

public class Video extends Products
{
	private String actor;
	private String language;
	
	
	public Video(String name, double price, String actor, String language)
	{
		super(name, price);
		this.actor = actor;
		this.language = language;
	}

	@Override
	public double endPrice(double discountRate)
	{
		// no discount
		return this.getPrice();
	}

	public String getActor()
	{
		return this.actor;
	}


	public String getLanguage()
	{
		return this.language;
	}


	@Override
	public String toString()
	{
		return "Video [actor=" + this.actor + ", language=" + this.language + ", toString()=" + super.toString() + "]";
	}



}

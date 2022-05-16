package com.bilgeadam.lesson020.homework;

public class Address
{

	private City city;
	private Street street;
	
	public Address(City city, Street street)
	{
		this.city = city;
		this.street = street;
	}

	public City getCity()
	{
		return this.city;
	}

	public Street getStreet()
	{
		return this.street;
	}

}

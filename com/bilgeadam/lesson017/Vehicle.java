package com.bilgeadam.lesson017;

public class Vehicle
{
	private String brand;
	private String name;
	private String color;
	protected String engine = "Car Engine";
	private int maxSpeed;

	public Vehicle(String brand, String name, String color, int maxSpeed)
	{
		this.brand = brand;
		this.name = name;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	public void tellAboutYourSelf()
	{
		System.out.println("I am a vehicle.");
	}
	
	public String getBrand()
	{
		return this.brand;
	}

	public String getName()
	{
		return this.name;
	}

	public String getColor()
	{
		return this.color;
	}

	public String getEngine()
	{
		return this.engine;
	}

	public int getMaxSpeed()
	{
		return this.maxSpeed;
	}

}

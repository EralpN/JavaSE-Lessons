package com.bilgeadam.lesson017;

public class Airplane extends Vehicle
{
private double wingSpan;
private double maxHeight;

public Airplane(String brand, String name, String color, int maxSpeed, double wingSpan, double maxHeight)
{
	super(brand, name, color, maxSpeed);
	this.wingSpan = wingSpan;
	this.maxHeight = maxHeight;
	this.engine = "Airplane Engine";
}

@Override
public void tellAboutYourSelf()
{
	System.out.println("I am an airplane.");
}



public double getWingSpan()
{
	return this.wingSpan;
}

public double getMaxHeight()
{
	return this.maxHeight;
}

}

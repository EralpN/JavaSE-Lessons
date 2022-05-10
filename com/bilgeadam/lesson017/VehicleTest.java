package com.bilgeadam.lesson017;

public class VehicleTest
{
	public static void main(String[] args)
	{
		Vehicle v1 = new Vehicle("BMW", "Sky", "Blue", 280);
		v1.tellAboutYourSelf();
		System.out.println("Brand: " + v1.getBrand());
		System.out.println("Name: " + v1.getName());
		System.out.println("Color: " + v1.getColor());
		System.out.println("Engine: " + v1.getEngine());
		System.out.println("Max Speed: " + v1.getMaxSpeed());
		
		System.out.println();
		
		Airplane a1 = new Airplane("Boeing", "Fly", "White", 780, 40, 4000);
		a1.tellAboutYourSelf();
		System.out.println("Brand: " + a1.getBrand());
		System.out.println("Name: " + a1.getName());
		System.out.println("Color: " + a1.getColor());
		System.out.println("Engine: " + a1.getEngine());
		System.out.println("Max Speed: " + a1.getMaxSpeed());
		System.out.println("Wing Span: " + a1.getWingSpan());
		System.out.println("Max Height: " + a1.getMaxHeight());
		
	}
}

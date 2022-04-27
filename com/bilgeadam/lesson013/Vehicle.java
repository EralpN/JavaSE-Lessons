package com.bilgeadam.lesson013;

public class Vehicle
{

	public static void main(String[] args)
	{
		MethodVehicle v1 = new MethodVehicle();
		v1.setAutomaticGear(false);
		v1.setColor("Blue");
		v1.setLabel("BMW");
		v1.setMaxSpeed(240);

		
		if (v1.isAutomaticGear())
		{
			System.out.println("Automatic");
		}
		else
		{
			System.out.println("Manual");
		}
		System.out.println("Color: " + v1.getColor());
		System.out.println("Brand: " + v1.getLabel());
		System.out.println("Max Speed: " + v1.getMaxSpeed());
	}
	
	

}

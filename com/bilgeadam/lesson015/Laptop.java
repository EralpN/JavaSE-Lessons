package com.bilgeadam.lesson015;

public class Laptop
{

	private String brand;
	private String ramSize;
	private double batteryCapacity = 100;
	private String screenSize;
	private boolean webConnected = false;
	
	
	public Laptop()
	{
		this.batteryCapacity = 100;
	}
	

	public void showFeatures()
	{
		System.out.println(this.brand);
		System.out.println(this.ramSize);
		System.out.println(this.screenSize);
		System.out.println(this.batteryCapacity);
		System.out.println(this.webConnected + "\n");
	}
	
	
	
	public void connectToWeb()
	{
		this.webConnected = !this.webConnected;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	
	public void setRamSize(String ramSize)
	{
		this.ramSize = ramSize;
	}
	
	public void setBatteryCapacity(double batteryCapacity)
	{
		this.batteryCapacity = batteryCapacity;
	}
	
	public void setScreenSize(String screenSize)
	{
		this.screenSize = screenSize;
	}



	public String getBrand()
	{
		return brand;
	}

	public String getRamSize()
	{
		return ramSize;
	}

	public double getBatteryCapacity()
	{
		return batteryCapacity;
	}

	public String getScreenSize()
	{
		return screenSize;
	}

	public boolean isWebConnected()
	{
		return webConnected;
	}
	
	
	
	
	
	
}

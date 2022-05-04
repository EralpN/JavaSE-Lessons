package com.bilgeadam.lesson015;

public class LaptopMain
{
	
	private Laptop laptop1;
	private Laptop laptop2;
	
	public static void main(String[] args)
	{
		LaptopMain console = new LaptopMain();
		
		console.initiateLaptop1();
		console.initiateLaptop2();
		
		
		System.out.println("Laptop 1: " + console.laptop1.getBrand() + "\nLaptop 2: " + console.laptop2.getBrand() + "\n");
		
		console.laptop1.showFeatures();
		console.laptop2.showFeatures();
		
		console.laptop1.connectToWeb();
		console.laptop2.connectToWeb();
		
		System.out.println("After connecting to internet.\n");
		
		console.laptop1.showFeatures();
		console.laptop2.showFeatures();
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	private void initiateLaptop1()
	{
		laptop1 = new Laptop();
		laptop1.setBrand("Monster Laptop");
		laptop1.setRamSize("32 Gb");
		laptop1.setScreenSize("17 inch");
	}
	
	private void initiateLaptop2()
	{
		laptop2 = new Laptop();
		laptop2.setBrand("HP Laptop");
		laptop2.setRamSize("16 Gb");
		laptop2.setScreenSize("15 inch");
	}
	
	
	
}

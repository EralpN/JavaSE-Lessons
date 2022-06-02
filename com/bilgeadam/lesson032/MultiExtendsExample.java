package com.bilgeadam.lesson032;

public class MultiExtendsExample extends Thread
{

	public static void main(String[] args)
	{
		MultiExtendsExample tread1 = new MultiExtendsExample();
		tread1.start();
		MultiExtendsExample tread2 = new MultiExtendsExample();
		tread2.start();
		MultiExtendsExample tread3 = new MultiExtendsExample();
		tread3.start();
		MultiExtendsExample tread4 = new MultiExtendsExample();
		tread4.start();
		MultiExtendsExample tread5 = new MultiExtendsExample();
		tread5.start();
		MultiExtendsExample tread6 = new MultiExtendsExample();
		tread6.start();
		MultiExtendsExample tread7 = new MultiExtendsExample();
		tread7.start();
	}

	
	@Override
	public void run()
	{
		System.out.println("Tread " + this.getName() + " is working.");
	}
}

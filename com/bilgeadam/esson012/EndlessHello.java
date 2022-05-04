package com.bilgeadam.esson012;

public class EndlessHello
{

	public static void main(String[] args)
	{
		sayHello(1);
	}

	private static void sayHello(int i)
	{
		System.out.println(i + " Hello");
		sayHello(++i);
	}
	

}

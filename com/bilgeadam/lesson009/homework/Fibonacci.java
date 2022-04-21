package com.bilgeadam.lesson009.homework;

import java.util.Scanner;

public class Fibonacci
{
public static void main(String[] args)
{
	Scanner ask = new Scanner(System.in);
	
	int temp = 0, prev = 0, current = 1, order, i;
	
	System.out.println("This program calculates the Fibonacci number at a given order from 1 to 47.");
	
		
	do
	{
	System.out.print("Order of your Fibonacci number: ");
	order = ask.nextInt();
	if (order == 1)
	{
		System.out.print("Your Fibonacci number: 0");
		System.exit(0);
	}
	} 
	while (!(order > 2 && order < 48));
	
	
	ask.close();
	
	for(i = 1; i != order - 1; i++)
	{
		temp = current;
		current = current + prev;
		prev = temp;
	}
	System.out.print("Your Fibonacci number: " + current);
}
}

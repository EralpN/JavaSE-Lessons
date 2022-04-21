package com.bilgeadam.lesson009;

import java.util.Random;
import java.util.Scanner;

public class ContinueBreak
{
public static void main(String[] args)
{
	Scanner ask = new Scanner(System.in);
	Random rnd = new Random();
	int input;
	int random;
	
	while(true)
	//continue comes here ************************
	{
	random = rnd.nextInt(10000);
	System.out.print("Type " + random + ": ");
	input = ask.nextInt();
	if (input != random)
	{
		System.out.println("Wrong input!");
		//continue sends you back to the start of loop
		continue;
	}
	else
	{
		System.out.println("You did it!");
		//break gets you out of your current loop
		break;
	}
	} 
	//break comes here ************************
	ask.close();
}
}

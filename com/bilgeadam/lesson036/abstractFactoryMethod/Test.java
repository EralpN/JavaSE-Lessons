package com.bilgeadam.lesson036.abstractFactoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test
{

	public static void main(String[] args) throws IOException, NoClassException
	{
		BufferedReader ask = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter super class (Str / Num): ");
		String superName = ask.readLine();
		// decides on which super class to create
		AbstractFactory createdFactory = FactoryProducer.produce(superName);
		
		System.out.println("Enter sub class name (1 , 2, 3 / A, B, C): ");
		String subName = ask.readLine();
		// decides on which sub class to create
		Createable createdClass = createdFactory.create(subName); 
		
		createdClass.assignName();
		createdClass.presentName();
	}

}

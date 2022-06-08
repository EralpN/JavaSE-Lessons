package com.bilgeadam.lesson035.factoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test
{

	public static void main(String[] args) throws IOException, NoClassException
	{
		BufferedReader ask = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter sub class number: ");
		String className = ask.readLine();
		
		// decides on which class to create
		SuperClass createdClass = Factory.getSuperClass(className);
		
		createdClass.assignName();
		createdClass.presentName();
	}

}

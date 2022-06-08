package com.bilgeadam.lesson036.abstractFactoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.bilgeadam.lesson036.abstractFactoryMethod.num.SuperClassNum;
import com.bilgeadam.lesson036.abstractFactoryMethod.str.SuperClassStr;

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
		
		SuperClassNum numClass;
		SuperClassStr strClass;
		
		if (createdClass.info().equalsIgnoreCase("Num"))
		{
			numClass = (SuperClassNum)createdClass;
			numClass.assignName();
			numClass.presentName();
		}
		else
		{
			strClass = (SuperClassStr)createdClass;
			strClass.assignName();
			strClass.presentName();
		}
	}

}

package com.bilgeadam.lesson036.prototyping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Property 1: ");
		String property1 = br.readLine();
		
		System.out.println("Property 2: ");
		String property2 = br.readLine();
		
		System.out.println("Property 3: ");
		String property3 = br.readLine();
		
		ClassToClone original = new ClassToClone(property1, property2, property3);
		ClassToClone clone = (ClassToClone) original.getClone();
		
		original.showString();
		System.out.println(original);
		
		clone.showString();
		System.out.println(clone);
		

	}

}

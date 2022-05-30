package com.bilgeadam.lesson018;

public class PersonTest
{

	public static void main(String[] args)
	{
		Person child1 = new Child("Ahmet", 11, true, true);
		Person child2 = new Child("Mehmet", 19, false, false);
		Person adult1 = new Adult("Vedat", 42, true);
		Person adult2 = new Adult("Ömer", 51, false);
		

		child1.operation();
		System.out.println();
		
		child2.operation();
		System.out.println();
		
		adult1.operation();
		System.out.println();
		
		adult2.operation();
		
		
	}

}

package com.bilgeadam.lesson024;

public class StringCompareExample
{

	public static void main(String[] args)
	{
		String first = "Happy";
		String second = "Coders";
		
		int result = first.compareTo(second);
		System.out.println(result);
		
		result = second.compareTo(first);
		System.out.println(result);
		
		result = first.compareTo("Happy");
		System.out.println(result);
				
	}

}

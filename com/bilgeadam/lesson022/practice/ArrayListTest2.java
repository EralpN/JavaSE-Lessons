package com.bilgeadam.lesson022.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2
{

	public static void main(String[] args)
	{
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		System.out.println("List: " + numbers);
		
		System.out.println(numbers.get(2));
		
		int removedNumber = numbers.remove(0);
		System.out.println("Removed Number: " + removedNumber);
		System.out.println("List: " + numbers);
		
	}

}

package com.bilgeadam.lesson024.practice;

import java.util.ArrayList;
import java.util.Comparator;

public class StreamExample
{

	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(25);
		numbers.add(12);
		numbers.add(3);
		numbers.add(89);
		numbers.add(25);
		numbers.add(44);
		numbers.add(100);
		numbers.add(7);
		numbers.add(63);
		
		System.out.println("Print list");
		numbers.stream().forEach(number -> System.out.println(number));
		System.out.println();
		
		System.out.println("Print numbers bigger than 60");
		numbers.stream().filter(number -> number > 60).forEach(number -> System.out.println(number));
		System.out.println();
		
		System.out.println("Print with no duplicates");
		numbers.stream().distinct().forEach(number -> System.out.println(number));
		System.out.println();
		
		System.out.println("Print sorted");
		numbers.stream().sorted().forEach(number -> System.out.println(number));
		System.out.println();
		
		System.out.println("Print reverse sorted");
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(number -> System.out.println(number));
		System.out.println();
		
		System.out.println("Skip 5 print rest");
		numbers.stream().skip(5).forEach(number -> System.out.println(number));;
		System.out.println();
		
		System.out.println("Print first 4");
		numbers.stream().limit(4).forEach(number -> System.out.println(number));
		System.out.println();
		
		System.out.println("Number of distict elements smaller than 40");
		System.out.println(
		numbers.stream().filter(number -> number < 40).distinct().count());
		System.out.println();
		
		System.out.println("Is there an element smaller than 5");
		System.out.println(
		numbers.stream().anyMatch(number -> number < 5));
		System.out.println();
		
		System.out.println("Is all numbers smaller than 5");
		System.out.println(
		numbers.stream().allMatch(number -> number < 5));
		System.out.println();
		
		System.out.println("Non of the numbers are smaller than 5");
		System.out.println(
		numbers.stream().noneMatch(number -> number < 5));
		System.out.println();
		
		System.out.println("All numbers * 2");
		numbers.stream().map(number -> number * 2).forEach(number -> System.out.println(number));
		System.out.println();
		
		System.out.println("Add all numbers");
		System.out.println( //value if null, element selection, action
		numbers.stream().reduce(0, (x, y) -> x + y));
		System.out.println(); // 0 + element1 + element2 + etc
	}

}

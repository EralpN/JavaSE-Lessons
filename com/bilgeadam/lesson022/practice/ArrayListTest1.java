package com.bilgeadam.lesson022.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest1
{

	public static void main(String[] args)
	{
		// Array List, Linked List, Vector, Stack implements List Interface
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		list1.add("John");
		list2.add("Doe");
		
		list1.addAll(list2);
		
		System.out.println(list1.get(0));
		System.out.println(list1.size());
		System.out.println(list1.contains("Doe"));
		
		list1.set(1, "Travolta");
		
		System.out.println(list1.contains("Doe"));
	}

}

package com.bilgeadam.lesson022.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort
{

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();

		list.add("John");
		list.add("Karen");
		list.add("Chris");
		list.add("Hank");
		
		System.out.println(list);
		
		Collections.sort(list); // a to z
		
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder()); // z to a
		
		System.out.println(list);
		
		Collections.reverse(list); // reverses
		
		System.out.println(list);
		
		System.out.println(list.indexOf("John"));
		
	}

}

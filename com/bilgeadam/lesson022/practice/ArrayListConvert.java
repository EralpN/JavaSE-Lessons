package com.bilgeadam.lesson022.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConvert
{

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();

		list.add("John");
		list.add("Karen");
		list.add("Chris");
		list.add("Hank");
		
		String[] names = new String[list.size()];
		list.toArray(names);
		
		for (String name : names)
		{
			System.out.println(name);
		}
	}

}

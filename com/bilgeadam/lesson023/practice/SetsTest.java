package com.bilgeadam.lesson023.practice;

import java.util.HashSet;
import java.util.Iterator;

public class SetsTest
{

	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet<>();
		set.add("John");
		set.add("Lee");
		set.add("Lara");
		set.add(null);
		
		set.remove(null);
		System.out.println(set.size());
		System.out.println(set.contains(null));
		
		System.out.println();
		
		for (String name : set)
		{
			System.out.println(name);
		}
		
		System.out.println();
		
		Iterator<String> iter = set.iterator();
		
		while (iter.hasNext())
		{
		System.out.println(iter.next());
		}
		
	}

}

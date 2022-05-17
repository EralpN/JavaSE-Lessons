package com.bilgeadam.lesson022;

import java.util.LinkedList;

public class LinkedListTest
{

	@SuppressWarnings({"unchecked", "rawtypes"})
	public static void main(String[] args)
	{
		LinkedList linkedList = new LinkedList();
		linkedList.add("Apple");
		linkedList.add("Pear");
		linkedList.add(0, "Banana");
		linkedList.add(2, "Strawberry");
		
		for (Object object : linkedList)
		{
			String fruit = (String)object;
			System.out.println(fruit);
		}
		
		Object[] objs = linkedList.toArray();
		System.out.println("\n" + objs[2]);
	}

}

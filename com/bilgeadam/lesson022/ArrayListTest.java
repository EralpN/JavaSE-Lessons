package com.bilgeadam.lesson022;

import java.util.ArrayList;

public class ArrayListTest
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		@SuppressWarnings("rawtypes")
		ArrayList arrayList = new ArrayList();
		arrayList.add("Apple");
		arrayList.add("Pear");
		arrayList.add(0, "Banana");
		arrayList.add(2, "Strawberry");
		
		for (Object object : arrayList)
		{
			String fruit = (String)object;
			System.out.println(fruit);
		}
		
		Object[] objs = arrayList.toArray();
		System.out.println("\n" + objs[2]);
	}

}

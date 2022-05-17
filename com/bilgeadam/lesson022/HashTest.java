package com.bilgeadam.lesson022;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class HashTest
{

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args)
	{
		// hash map
		
		HashMap hashMap = new HashMap();
		hashMap.put(1, "apple");
		hashMap.put(2, "pear");
		hashMap.put(3, "banana");
		
		Iterator valueIter = hashMap.values().iterator();
		while (valueIter.hasNext())
		{
			String fruit = (String)valueIter.next();
			System.out.println(fruit);
		}
		
		System.out.println();
		
		Iterator keyIter = hashMap.keySet().iterator();
		while (keyIter.hasNext())
		{
			int fruit = (Integer)keyIter.next();
			System.out.println(fruit);
		}
		
		System.out.println();
		
		System.out.println(hashMap.get(2));
		
		System.out.println();
		
		// hash table
		
		Hashtable hashTable = new Hashtable();
		hashTable.put(1, "watermelon");
		
		System.out.println(hashTable.get(1));
	}

}

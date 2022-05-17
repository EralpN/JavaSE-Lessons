package com.bilgeadam.lesson022.practice;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListTest2
{

	public static void main(String[] args)
	{
		Deque<String> list = new LinkedList<>();

		list.add("John");
		list.add("Karen");
		list.add("Chris");
		list.add("Hank");

		System.out.println(list);
		
		list.addFirst("Jacob");
		
		System.out.println(list);
		
		list.addLast("Scott");
		
		System.out.println(list);
		
		System.out.println(list.pop());
		
		System.out.println(list);
	}

}

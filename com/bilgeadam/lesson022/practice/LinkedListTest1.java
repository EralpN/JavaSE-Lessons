package com.bilgeadam.lesson022.practice;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListTest1
{

	public static void main(String[] args)
	{
		Queue<String> list = new LinkedList<>();
		
		list.add("John");
		list.add("Karen");
		list.add("Chris");
		list.add("Hank");
		
		System.out.println(list);
		
		System.out.println(list.peek()); //take first value
		System.out.println(list.poll()); //take and remove first value
		
		System.out.println(list);
		
		System.out.println(list.offer("Jesse")); //adds new element if it can
		
		System.out.println(list);
	}

}

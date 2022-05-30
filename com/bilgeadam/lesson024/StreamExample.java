package com.bilgeadam.lesson024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample
{

	public static void main(String[] args)
	{
		List<String> numberList = Arrays.asList("1", "2", "3", "4", "5");
		List<Integer> numberList2 = Arrays.asList(1, 2, 3, 4, 5);
		
		List<String> charList = new ArrayList<>();
		charList.add("a");
		charList.add("b");
		charList.add("c");
		charList.add("d");
		charList.add("e");
		
		Stream<String> stream1 = numberList.stream();
		Stream<Integer> stream2 = numberList2.stream();
		Stream<String> parallel = charList.parallelStream();
		
		
		stream1.forEach(s ->  System.out.println(s + Thread.currentThread()));
		System.out.println();
		parallel.forEach(s ->  System.out.println(s + Thread.currentThread()));
		System.out.println();
		stream2.map(i ->  i * i).forEach(i -> {System.out.println(i); System.out.println("hi");});
	}

}

package com.bilgeadam.lesson024;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExpressions
{

	public static void main(String[] args)
	{
		List<String> names = Arrays.asList("Joe", "Arnold", "Lara", "Jacob");

		Collections.sort(names, (first, second) ->
		{
			return first.compareToIgnoreCase(second);
		});
		
		for (String name : names)
		{
			System.out.println(name);
		}
	}

}

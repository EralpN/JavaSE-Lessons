package com.bilgeadam.lesson025;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.bilgeadam.lesson024.User;

public class CompareWithLambda
{

	public static void main(String[] args)
	{
		List<User> users = new ArrayList<>();

		users.add(new User(1, "Arnold"));
		users.add(new User(2, "Amelia"));
		users.add(new User(3, "Zack"));
		users.add(new User(4, "Mathew"));
		users.add(new User(5, "Yasmin"));
		users.add(new User(6, "Luke"));
		users.add(new User(7, "Ethan"));
		
		users.sort((first, second) -> first.getName().compareTo(second.getName()));
		
		//						   Class :: Method
		users.stream().forEach(System.out::println);
		
		System.out.println();
		users.sort(Comparator.comparing(User::getName).reversed());
		users.stream().forEach(System.out::println);
	
		System.out.println();
		users.sort(Comparator.comparing(User::getId));
		users.stream().forEach(System.out::println);
	}

}


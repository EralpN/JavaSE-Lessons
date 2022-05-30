package com.bilgeadam.lesson024.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonTest
{

	public static void main(String[] args)
	{
		List<Person> people = new ArrayList<>();
		
		people.add(new Person("Whittaker", "Godleman", "Male", 32));
		people.add(new Person("Merola", "Wrout", "Female", 32));
		people.add(new Person("Melosa", "Courage", "Female", 14));
		people.add(new Person("Sydney", "Cullington", "Female", 74));
		people.add(new Person("Sherwin", "Ogley", "Male", 14));
		people.add(new Person("Dukie", "Malpass", "Male", 30));
		people.add(new Person("Jarrett", "Fearick", "Male", 77));
		people.add(new Person("Willie", "Childerhouse", "Male", 31));
		people.add(new Person("Berky", "Tollmache", "Male", 73));
		people.add(new Person("Nanete", "Blunsden", "Female", 81));
		
		//form a map from people with an age below 50, use name as key
		people.stream().filter(p -> p.getAge() < 50)
		.collect(Collectors.toMap(p -> p.getName(), p -> p.getAge()))
		.forEach((name, age) -> System.out.println(name + " " + age));
		System.out.println();
		
		//form a list from male people who are lower than the age 35 make them speak
		people.stream().filter(p -> p.getAge() < 35 && p.getGender().equalsIgnoreCase("male"))
		.toList().forEach(p -> p.speak());
		System.out.println();
		
		//form a set from male people with their age increased by 15
		people.stream().filter(p -> p.getGender().equalsIgnoreCase("male"))
		.map(person -> new Person(person.getName(), person.getLastName(), person.getGender(), person.getAge() + 15))
		.collect(Collectors.toSet())
		.forEach(p -> System.out.println(p.getName() + " " + p.getAge()));
	}

}

package com.bilgeadam.lesson024;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFeatures
{
public static void main(String[] args) {
		
		List<User> users = new ArrayList<>();
		
		users.add(new User(1,"Arnold"));
		users.add(new User(2,"Amelia"));
		users.add(new User(3,"Zack"));
		users.add(new User(4,"Mathew"));
		users.add(new User(5,"Yasmin"));
		users.add(new User(6,"Luke"));
		users.add(new User(7,"Ethan"));
		
		
//		users.stream().forEach(user -> user.talk());
		
//		users.stream().forEach(User::talk); //method reference
		
		// amount of users with id bigger than 5
//		long count = users.stream().filter(user -> user.id > 5).count();
//		System.out.println("Count: " + count);
		
		// talk method for id bigger than 4
//		List<User> filteredList = users.stream()
//		.filter(user -> user.id > 4)
//		.collect(Collectors.toList());
//		
//		filteredList.stream().forEach(User::talk);
		
		
//		List<User> mappedList = users.stream()
//				.map(user -> new User(user.id + 100, user.name))
//				.collect(Collectors.toList());
//		mappedList.stream().forEach(user -> System.out.println(user));
//		
		
		Map<Integer,String> userMap = users.stream()
				.collect(Collectors.toMap(user -> user.id, user -> user.name));
		
		userMap.forEach((key, value) -> System.out.println(key + " : " + value));
		
	}
}

package com.bilgeadam.lesson011.practice;

public class NonPrimitiveTypes
{
	public static void main(String[] args)
	{
		Person person1 = new Person(); // person1 is created
		person1.name = "One";
		person1.age = 20;
		person1.salary = 35.5d;

		Person person2 = new Person(); // person2 is created
		person2.name = "Two"; 
		person2.age = 26;
		person2.salary = 39.99d;

		System.out.println("One's name:  " + person1.name + "\tOne's reference (memory adress):  " + person1); // name of person1 and person2
		System.out.println("Two's name: " + person2.name + "\t\tTwo's reference (memory adress): " + person2);// their reference addresses

		Person person3 = null; // person3 will be used but not created
		System.out.println("\t\t\tThree's reference: " + person3); // person3 has no data yet

		person3 = person1; // person3 and person1 are the same person

		if (person3 == person1)
		{
			System.err.println("Three and One share the  same address (==)\n");
		}
		else
		{
			System.err.println("Tree and One dont share the same address (!=)\n");
		}
		System.out.println("One's name:  " + person1.name + "\tOne's reference (memory adress):  " + person1); // both have same address
		System.out.println("Two's name: " + person2.name + "\t\tTwo's reference (memory adress): " + person2);
		System.out.println("Three's name: " + person3.name + "\tThree's reference (memory adress): " + person3);

		person3.name = "Three"; // any change to person1 or person3 change both due to shared address
		System.out.println("One's name:  " + person1.name + "\tOne's reference (memory adress):  " + person1);
		System.out.println("Two's name: " + person2.name + "\t\tTwo's reference (memory adress): " + person2);
		System.out.println("Three's name: " + person3.name + "\tThree's reference (memory adress): " + person3);

		person3 = new Person(); // person3 is now created and has its own address
		
		person3.name = "Three"; // changes made to person3 now wont effect person1
		person3.age = 27;
		person3.salary = 55d;
		if (person3 == person1)
		{
			System.err.println("Three and One share the  same address (==)\n");
		}
		else
		{
			System.err.println("Tree and One dont share the same address (!=)\n");
		}

		System.out.println("One's name:  " + person1.name + "\tOne's reference (memory adress):  " + person1);
		System.out.println("Two's name: " + person2.name + "\t\tTwo's reference (memory adress): " + person2);
		System.out.println("Three's name: " + person3.name + "\tThree's reference (memory adress): " + person3);

		System.out.println();
		Person person4 = new Person(); // creating a new person4
		person4.name = person3.name; // person4 has a different address now but can be given same values as person3
		person4.age = person3.age;
		person4.salary = person3.salary; // person3 and person4 now share the same values but have different addresses
		System.out.println("Three's name: " + person3.name + "\tThree's reference (memory adress): " + person3);
		System.out.println("Four's name: " + person4.name + "\tFour's reference (memory adress): " + person4);

		person4.name = "Four"; // changes to person4 does not effect person3
		System.out.println("Three's name: " + person3.name + "\tThree's reference (memory adress): " + person3);
		System.out.println("Four's name: " + person4.name + "\tFour's reference (memory adress): " + person4);

	}

}

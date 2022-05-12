package com.bilgeadam.lesson019;

import java.time.LocalDate;

import com.bilgeadam.lesson019.model.People.Customer;
import com.bilgeadam.lesson019.model.People.Employee;
import com.bilgeadam.lesson019.model.People.EmployeePosition;
import com.bilgeadam.lesson019.model.People.Person;

public class Market
{

	public static void main (String[] args)
	{
		Person customer = new Customer("Ahmet", LocalDate.now(), "Patates");
		System.out.println(customer);
		
		Person employee = new Employee("Mehmet", LocalDate.now(), 5000, LocalDate.now(), EmployeePosition.CASHIER);
		System.out.println(employee);
	}
	
	public Market()
	{
		// TODO Auto-generated constructor stub
	}

}

package com.bilgeadam.lesson019.model.People;

import java.time.LocalDate;

public class Customer extends Person
{

	private boolean isClose;
	private String favoriteProduct;
	
	private int customerCounter;
	
	public Customer(String name, LocalDate birthDate, String favoriteProduct)
	{
		super(name, birthDate);
		this.favoriteProduct = favoriteProduct;
		
	}

	@Override
	protected String generateID()
	{
		String num = String.format("%04d", ++customerCounter);
		return "CTS-" + num;
	}

	@Override
	public String toString()
	{
		return "Customer [isClose=" + this.isClose + ", favoriteProduct=" + this.favoriteProduct + ", customerCounter="
				+ this.customerCounter + ", idNumber=" + this.idNumber + ", toString()=" + super.toString() + "]";
	}


	
	


	
	
}

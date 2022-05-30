package com.bilgeadam.lesson026.object;

import java.io.Serializable;

public class Dog implements Serializable
{

	private static final long serialVersionUID = 920957724085678535L;

	
	String name;
	String breed;

	public Dog(String name, String breed)
	{
		super();
		this.name = name;
		this.breed = breed;
	}

}

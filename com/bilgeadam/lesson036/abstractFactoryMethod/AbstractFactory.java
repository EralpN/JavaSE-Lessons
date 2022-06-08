package com.bilgeadam.lesson036.abstractFactoryMethod;

public abstract class AbstractFactory
{
	public abstract Createable create(String type) throws NoClassException;
}

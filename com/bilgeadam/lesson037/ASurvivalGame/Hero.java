package com.bilgeadam.lesson037.ASurvivalGame;

public class Hero extends Entity
{
	private static Hero instance;

	private Hero(Characters character)
	{
		super(character);
	}

	public static Hero getHero()
	{
		if (instance == null)
		{
			instance = new Hero(Characters.HERO);
		}
		return instance;
	}

}

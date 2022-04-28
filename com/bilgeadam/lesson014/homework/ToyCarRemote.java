package com.bilgeadam.lesson014.homework;

import java.util.Scanner;

public class ToyCarRemote
{
	private ToyCar toyCar;
	
	public static void main(String[] args)
	{
		ToyCarRemote remote = new ToyCarRemote();
		remote.initiateToyCar();
		while(true)
		{
		remote.toyCar.userInterface();
		remote.toyCar.runCommand(remote.inputCommand());
		}
	}
	
	
	
	private void initiateToyCar()
	{
		toyCar = new ToyCar();
	}
	
	
	
	
	
	String inputCommand()
	{
	Scanner input = new Scanner(System.in);

	while (true)
	{
	String desicion = input.nextLine().toLowerCase();
	if (desicion.equals("w")|| desicion.equals("a") || desicion.equals("s") || desicion.equals("d") || desicion.equals("c") || desicion.equals("q"))
	{
		if (desicion.equals("q"))
		{
			input.close();
		}
		return desicion;
	}
	toyCar.userInterface();
	}
	}
	
	
	
}

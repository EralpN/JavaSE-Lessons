package com.bilgeadam.lesson013.practice;

public class VariableLifeTime
{
	
int variable = 15;

	public static void main(String[] args)
	{
		VariableLifeTime printVariable = new VariableLifeTime();
		int variable = 20;
		printVariable.printVariable();
		System.out.println("Variable inside main: " + variable);
	}
	
	
	public void printVariable()
	{
		int variable = 10;
		System.out.println("Variable inside method: " + variable);
		System.out.println("Variable inside class: " + this.variable);
	}
	
	
}
// This code is to see variable life times
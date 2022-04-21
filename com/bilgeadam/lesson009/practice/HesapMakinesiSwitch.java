package com.bilgeadam.lesson009.practice;

import java.util.Scanner;

public class HesapMakinesiSwitch
{
public static void main(String[] args)
{
	String operation = "";
	double firstNumber, secondNumber;
	double result = 0;
	
	Scanner ask = new Scanner(System.in);
	
	System.out.print("First number: ");
	firstNumber = ask.nextDouble();
	
	System.out.print("Second number: ");
	secondNumber = ask.nextDouble();
	
	do
	{
	System.out.print("Operation to execute (+,-,*,/): ");
	operation = ask.next();
	operation.trim();
	}
	while (!(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")));
	
	ask.close();
	
	switch(operation)
	{
	case "+":
		result = firstNumber + secondNumber;
		break;
	case "-":
		result = firstNumber - secondNumber;
		break;
	case "*":
		result = firstNumber * secondNumber;
		break;
	case "/":
		result = firstNumber / secondNumber;
		break;
	default:
		System.err.println("Error");
		System.exit(0);
	}
	
	System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + result);
	
}
}

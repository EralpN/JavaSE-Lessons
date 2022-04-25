package com.bilgeadam.lesson009.practice;

import java.util.Scanner;

public class Palindrome
{

	public static void main(String[] args)
	{
		System.out.println("Is your word a Palindrome?");
		
		String word;
		String wordP;
		
		int length;
		int mid;
		int i;
		
		Scanner ask = new Scanner(System.in);
		
		System.out.print("Enter the word: ");
		word = ask.next();
		ask.close();
		
		//trim deletes the spaces 
		wordP = word.trim();
		
		//toLowerCase turns all characters to lower case
		wordP = wordP.toLowerCase();
		
		//length gives us the string length
		length = word.length();
		i = 0;
		mid = length / 2;
		
		while (i <= mid)
		{
			//.charAt() gives the character at given place
			if(wordP.charAt(i) == wordP.charAt(length - i - 1))
			{
				i++;
			}
			else
			{
				System.out.println(word + " is not a Palindrome!");
				System.exit(0);
			}
		}
		System.out.println(word + " is a Palindrome!");
	}

}

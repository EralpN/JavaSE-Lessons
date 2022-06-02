package com.bilgeadam.lesson030.practice;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class DefaultLocale
{

	public static void main(String[] args)
	{
		Locale locale1 = new Locale("en", "US");
		Locale locale2 = new Locale("fr", "FR");
		Locale locale3 = new Locale("tr", "TR");
		
		System.out.println(locale1.getDisplayCountry());
		System.out.println(locale1.getDisplayLanguage());
		System.out.println(locale1.getDisplayName());
		System.out.println(locale1.getISO3Country());
		System.out.println(locale1.getISO3Language());
		System.out.println(locale1.getCountry());
		System.out.println(locale1.getLanguage());
		System.out.println(locale1.getDisplayCountry(locale1));
		System.out.println(locale1.getDisplayLanguage(locale1));
		System.out.println(locale1.getDisplayName(locale1));
		System.out.println();
		
		System.out.println(locale2.getDisplayCountry());
		System.out.println(locale2.getDisplayLanguage());
		System.out.println(locale2.getDisplayName());
		System.out.println(locale2.getISO3Country());
		System.out.println(locale2.getISO3Language());
		System.out.println(locale2.getCountry());
		System.out.println(locale2.getLanguage());
		System.out.println(locale2.getDisplayCountry(locale2));
		System.out.println(locale2.getDisplayLanguage(locale2));
		System.out.println(locale2.getDisplayName(locale2));
		System.out.println();
		
		System.out.println(locale3.getDisplayCountry());
		System.out.println(locale3.getDisplayLanguage());
		System.out.println(locale3.getDisplayName());
		System.out.println(locale3.getISO3Country());
		System.out.println(locale3.getISO3Language());
		System.out.println(locale3.getCountry());
		System.out.println(locale3.getLanguage());
		System.out.println(locale3.getDisplayCountry(locale3));
		System.out.println(locale3.getDisplayLanguage(locale3));
		System.out.println(locale3.getDisplayName(locale3));
		System.out.println();
		
		printDate(locale1);
		printDate(locale2);
		printDate(locale3);
		System.out.println();
		
		printTime(locale1);
		printTime(locale2);
		printTime(locale3);
		System.out.println();
		
		printNumber(locale1);
		printNumber(locale2);
		printNumber(locale3);
		System.out.println();
		
		printCurrency(locale1);
		printCurrency(locale2);
		printCurrency(locale3);
	}
	
	static void printDate(Locale locale)
	{
		DateFormat formatter = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		Date currentDate = new Date();
		String date = formatter.format(currentDate);
		System.out.println(date);
	}

	static void printTime(Locale locale)
	{
		DateFormat formatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
		Date currentDate = new Date();
		String time = formatter.format(currentDate);
		System.out.println(time + " " + locale.getDisplayCountry(locale));
	}
	
	static void printNumber(Locale locale)
	{
		NumberFormat formatter = NumberFormat.getNumberInstance(locale);
		String number = formatter.format(3123.123d);
		System.out.println(number + " " + locale.getDisplayCountry(locale));
	}
	
	static void printCurrency(Locale locale)
	{
		NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
		String currency = formatter.format(3123.123d);
		System.out.println(currency + " " + locale.getDisplayCountry(locale));
	}
}

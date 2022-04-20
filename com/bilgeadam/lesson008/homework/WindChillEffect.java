package com.bilgeadam.lesson008.homework;

import java.util.Scanner;

/*
Formula Taken From "https://www.weather.gov/safety/cold-wind-chill-chart"
Program answers are different from online calculator results.
*/

public class WindChillEffect
{

	public static void main(String[] args)
	{
		Scanner ask = new Scanner(System.in);
		
		double speedMPH, speedKmH, tempC, tempF, windChillTempC, windChillTempF;
		
		System.out.println("Winds need to be above 4.8 km/hr and below 177 km/hr \nTemperatures need to be above -50°C and at or below 10°C");
		
		do
		{
		System.out.print("Speed of wind in km/h: ");
		speedKmH = ask.nextDouble();
		}
		while (!(speedKmH >= 4.8 && speedKmH <= 177));
		speedMPH = speedKmH / 1.60934;
		
		do
		{
		System.out.print("Temperature in Celsius: ");
		tempC = ask.nextDouble();
		}
		while (!(tempC >= -50 && tempC <= 10));
		tempF = (tempC + 1.8) + 32;
		
		ask.close();
		
		windChillTempF = 35.74 + (0.6215 * tempF) - (35.75 * Math.pow(speedMPH, 0.16)) + (0.4275 * tempF * Math.pow(speedMPH, 0.16));
		windChillTempC = (windChillTempF - 32) / 1.8;
		
		System.out.println("Wind Chill Temperature in Celcius: " + windChillTempC + "\nWind Chill Temperature in Fahrenheit: " + windChillTempF);
	}

}

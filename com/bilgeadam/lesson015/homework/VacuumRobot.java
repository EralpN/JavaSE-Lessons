package com.bilgeadam.lesson015.homework;

import java.util.Scanner;

public class VacuumRobot
{

	int time1;
	int time2;
	int cleaningDurationInHours;

	public static void main(String[] args)
	{
		VacuumRobot vacuumRobot = new VacuumRobot();
		vacuumRobot.askRobotData();
		VacuumRobotMemory robotMem = new VacuumRobotMemory(vacuumRobot.time1, vacuumRobot.time2, vacuumRobot.cleaningDurationInHours);
		robotMem.robotAtDock();
	}

	private void askRobotData()
	{
		Scanner ask = new Scanner(System.in);
		do
		{
			System.out.print("How long will it take robot to clean whole house? \nAnswer in 1 to 4 hours: ");
			cleaningDurationInHours = ask.nextInt();
		}
		while (!(cleaningDurationInHours > 0 && cleaningDurationInHours < 5));

		do
		{
			System.out.print("When should robot start the first cleaning? (Second cleaning will start 12 hours after the first) \nAnswer 0 to 11 hours: ");
			time1 = ask.nextInt();
		}
		while (!(time1 >= 0 && time1 < 12));

		time2 = time1 + 12;
		System.out.println("Second cleaning time is set to " + time2 + ":00");

		ask.close();
	}
}

package com.bilgeadam.lesson015.homework;

import java.util.concurrent.TimeUnit;

public class VacuumRobotMemory
{

	private int time1;
	private int time2;
	private int cleaningDurationInHours;

	private int batteryLevelPercentage = 100;
	private int dustBagFullnessPercentage = 0;

	private boolean isMapReady;

	private int hours = 0;
	private int minutes = 0;

	private long messageDelayTimeSeconds = 1;

	// Can be changed for testing **********
	private int batteryConsumption = 5;	//**
	private int batteryFillRate = 10;	//**
	private int dustBagFillRate = 4;	//**
	// *************************************
	
	public VacuumRobotMemory(int firstCleaningTime, int secondCleaningTime, int cleaningDurationInHours)
	{
		this.time1 = firstCleaningTime;
		this.time2 = secondCleaningTime;
		this.cleaningDurationInHours = cleaningDurationInHours;
	}

	// Operating loop

	public void robotAtDock()
	{
		while (true)
		{
			if (isDustBagFull())
			{
				for (int i = 0; i <= 2; i++)
				{
					System.out.println("Beep! Dust bag full!");
					delay(messageDelayTimeSeconds);
				}
				emptyDustBag();
				System.out.println("Dust bag has been replaced by owner!");
				delay(messageDelayTimeSeconds);
			}
			chargeBattery();
			time();
			delay(messageDelayTimeSeconds);

			if (isStartTime() && this.batteryLevelPercentage < 50)
			{
				System.out.println("Battery too low to start, skipping this cycle!");
				delay(messageDelayTimeSeconds);
			}
			else if (isStartTime() && this.batteryLevelPercentage >= 50)
			{
				checkMap();
				if (isStartTime() && this.batteryLevelPercentage >= 50)
				{
					startCleaning();
				}
			}
		}
	}

	// Robot action related

	private void startCleaning()
	{
		System.out.println("Opening vacuum");
		delay(messageDelayTimeSeconds);

		while (!(isBatteryLow() || isDustBagFull() || isCleaningDone()))
		{
			System.out.println("Cleaning and following the map...");
			useBattery();
			fillDustBag();
			time();
			delay(messageDelayTimeSeconds);
		}

		cleaningWarningMessage();
		System.out.println("Closing vacuum");
		delay(messageDelayTimeSeconds);
		returnToDock();
	}

	private void cleaningWarningMessage()
	{
		if (isBatteryLow())
		{
			System.out.println("Low Battery!");
			delay(messageDelayTimeSeconds);
		}
		if (isDustBagFull())
		{
			System.out.println("Dust Bag Full!");
			delay(messageDelayTimeSeconds);
		}
		if (isCleaningDone())
		{
			System.out.println("Cleaning complete!");
			delay(messageDelayTimeSeconds);
		}
	}

	private void returnToDock()
	{
		for (int i = 0; i <= 1; i++)
		{
			if (this.batteryLevelPercentage <= 0)
			{
				System.err.println("Battery empty! Probably faulty. Please contact manufacturer!");
				System.exit(0);
			}
			System.out.println("Returning to dock...");
			useBattery();
			time();
			delay(messageDelayTimeSeconds);
		}
		System.out.println("Robot has returned.");
		delay(messageDelayTimeSeconds);
	}

	// Map related

	private void checkMap()
	{
		if (!this.isMapReady)
		{
			System.out.println("A map of the surrounding area was not found in the memory.");
			delay(messageDelayTimeSeconds);
			System.out.println("Robot needs to explore the room and draw a map of the surroundings.");
			delay(messageDelayTimeSeconds);
			System.out.println("This will take some time so please do not interfere with the robot while it is working.");
			delay(messageDelayTimeSeconds);

			for (int i = 0; i <= (3 * cleaningDurationInHours); i++)
			{
				if (this.batteryLevelPercentage <= 0)
				{
					System.err.println("Battery empty! Probably faulty. Please contact manufacturer!");
					System.exit(0);
				}
				System.out.println("Exploring please do not interfere!");
				useBattery();
				time();
				delay(messageDelayTimeSeconds);
			}

			this.isMapReady = true;
			System.out.println("Map has been created.");
			delay(messageDelayTimeSeconds);
		}
		else
		{
			System.out.println("A map of surroundings was found in memory.");
			delay(messageDelayTimeSeconds);
		}
	}

	// Cleaning related

	private boolean isCleaningDone()
	{
		boolean isCleaningDone = true;
		if (isFirstCleaning() || isSecondCleaning())
		{
			isCleaningDone = false;
		}
		return isCleaningDone;
	}

	private boolean isFirstCleaning()
	{
		boolean isFirstCleaning = false;
		int firstCleaningEnd;
		if ((time1 + cleaningDurationInHours) > 23)
		{
			firstCleaningEnd = time1 - 24 + cleaningDurationInHours;
			if ((time1 <= hours && hours < 24) || (0 <= hours && hours < firstCleaningEnd))
			{
				isFirstCleaning = true;
			}
		}
		if ((time1 + cleaningDurationInHours) <= 23)
		{
			firstCleaningEnd = time1 + cleaningDurationInHours;
			if (time1 <= hours && hours < firstCleaningEnd)
			{
				isFirstCleaning = true;
			}
		}
		return isFirstCleaning;
	}

	private boolean isSecondCleaning()
	{
		boolean isSecondCleaning = false;
		int secondCleaningEnd;
		if ((time2 + cleaningDurationInHours) > 23)
		{
			secondCleaningEnd = time2 - 24 + cleaningDurationInHours;
			if ((time2 <= hours && hours < 24) || (0 <= hours && hours < secondCleaningEnd))
			{
				isSecondCleaning = true;
			}
		}
		if ((time2 + cleaningDurationInHours) <= 23)
		{
			secondCleaningEnd = time2 + cleaningDurationInHours;
			if (time2 <= hours && hours < secondCleaningEnd)
			{
				isSecondCleaning = true;
			}
		}
		return isSecondCleaning;
	}

	// Dust bag related

	private boolean isDustBagFull()
	{
		boolean isDustBagFull = false;
		if (this.dustBagFullnessPercentage >= 100)
		{
			isDustBagFull = true;
		}
		return isDustBagFull;
	}

	private int fillDustBag()
	{
		this.dustBagFullnessPercentage += this.dustBagFillRate;
		if (this.dustBagFullnessPercentage > 100)
		{
			this.dustBagFullnessPercentage = 100;
		}
		System.out.println("Dust bag fullness: " + this.dustBagFullnessPercentage + "%");
		return this.dustBagFullnessPercentage;
	}

	private int emptyDustBag()
	{
		this.dustBagFullnessPercentage = 0;
		return this.dustBagFullnessPercentage;
	}

	// Battery related

	private boolean isBatteryLow()
	{
		boolean isBatteryLow = true;
		if (this.batteryLevelPercentage > 20)
		{
			isBatteryLow = false;
		}
		return isBatteryLow;
	}

	private int useBattery()
	{
		this.batteryLevelPercentage -= this.batteryConsumption;
		if (this.batteryLevelPercentage < 0)
		{
			this.batteryLevelPercentage = 0;
		}
		System.out.println("Current battery level: " + this.batteryLevelPercentage + "%");
		return batteryLevelPercentage;
	}

	private int chargeBattery()
	{
		this.batteryLevelPercentage += this.batteryFillRate;
		if (this.batteryLevelPercentage > 100)
		{
			this.batteryLevelPercentage = 100;
		}
		System.out.println("Current battery level: " + this.batteryLevelPercentage + "%");
		return batteryLevelPercentage;
	}

	// Time related

	private void time()
	{

		if (hours <= 9)
		{
			System.out.println("0" + hours + ":" + minutes + "0");
		}
		else
		{
			System.out.println(hours + ":" + minutes + "0");
		}

		minutes += 2;

		if (minutes == 6)
		{
			hours++;
			minutes = 0;
		}

		if (hours == 24)
		{
			hours = 0;
		}
	}

	private boolean isStartTime()
	{
		boolean isStartTime = false;
		if (time1 == hours || time2 == hours)
		{
			isStartTime = true;
		}
		return isStartTime;
	}

	// This method was found on Internet (makes program wait as long as a given time)
	private void delay(long delayInSeconds)
	{
		try
		{
			TimeUnit.SECONDS.sleep(delayInSeconds);
		}
		catch (InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
}

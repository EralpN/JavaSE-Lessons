package com.bilgeadam.lesson032.practice;

public class JoinMethod extends Thread
{

	public static void main(String[] args)
	{
		
		JoinMethod instance1 = new JoinMethod();
		instance1.setName("Thread 1");
		JoinMethod instance2 = new JoinMethod();
		instance2.setName("Thread 2");
		JoinMethod instance3 = new JoinMethod();
		instance3.setName("Thread 3");
		
		instance1.start();
		
		try
		{
			instance1.join(3000); // how much time given for other threads to start
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		instance2.start();
		instance3.start();
	}

	
	@Override
	public void run()
	{
		for (int i = 0; i < 4; i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println((i + 1) + " - " + Thread.currentThread().getName());
		}
	}
	
	
	
}

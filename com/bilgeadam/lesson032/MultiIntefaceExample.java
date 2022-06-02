package com.bilgeadam.lesson032;

public class MultiIntefaceExample implements Runnable
{

	public static void main(String[] args)
	{
		MultiIntefaceExample instance = new MultiIntefaceExample();
		Thread tread1 = new Thread(instance, "Thread 1");
		tread1.start();
		Thread tread2 = new Thread(instance, "Thread 2");
		tread2.start();
		Thread tread3 = new Thread(instance, "Thread 3");
		tread3.start();
		Thread tread4 = new Thread(instance, "Thread 4");
		tread4.start();
		Thread tread5 = new Thread(instance, "Thread 5");
		tread5.start();
		Thread tread6 = new Thread(instance, "Thread 6");
		tread6.start();
		Thread tread7 = new Thread(instance, "Thread 7");
		tread7.start();
		
		Thread[] threads = new Thread[10];
		for (int i = 0; i < threads.length; i++)
		{
			threads[i] = new Thread(instance, "Thread " + (i + 8));
			threads[i].start();
		}
	}

	@Override
	public void run()
	{
		System.out.println("Tread " + Thread.currentThread().getName() + " is working.");
	}

}

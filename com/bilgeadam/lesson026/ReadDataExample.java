package com.bilgeadam.lesson026;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class ReadDataExample
{

	public static void main(String[] args)
	{

		File inputFile = new File("D:\\javalib\\JavaSE Lessons\\com\\bilgeadam\\lesson026\\values.dat");

		try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(inputFile))))
		{
			while (true)
			{
				try
				{
					Double value = in.readDouble();
					System.out.println(value);
				}
				catch (Exception e)
				{
					break;
				}
			}
		}
		catch (Exception e)
		{
			System.err.println("Something went wrong " + e.getMessage());
		}

	}

}

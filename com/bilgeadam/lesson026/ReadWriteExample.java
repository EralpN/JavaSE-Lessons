package com.bilgeadam.lesson026;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

public class ReadWriteExample
{

	public static void main(String[] args)
	{
		File inputFile = new File("D:\\javalib\\JavaSE Lessons\\com\\bilgeadam\\lesson026\\Measurements.txt");
		File outputFile = new File("D:\\javalib\\JavaSE Lessons\\com\\bilgeadam\\lesson026\\values.dat");

		try (FileReader fileReader = new FileReader(inputFile);
				BufferedReader reader = new BufferedReader(fileReader);
				FileOutputStream fileWriter = new FileOutputStream(outputFile);
				BufferedOutputStream writer = new BufferedOutputStream(fileWriter);
				DataOutputStream convertedWriter = new DataOutputStream(writer))
		{
			while (true)
			{
				String line = reader.readLine();
				if (line == null)
				{
					break;
				}
				// write measurements.txt to values.dat as doubles in binary
				convertedWriter.writeDouble(Double.parseDouble(line));
			}
		}
		catch (Exception e)
		{
			System.err.println("Something went wrong " + e.getMessage());
		}
		System.out.println("Done.");
	}

}

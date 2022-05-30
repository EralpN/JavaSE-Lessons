package com.bilgeadam.lesson026;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample
{

	public static void main(String[] args)
	{
		File myFile = new File("D:\\javalib\\JavaSE Lessons\\com\\bilgeadam\\lesson026\\Second Text File.txt");

		if (!myFile.exists())
		{
			System.err.println("File does not exist");
			System.exit(0);
		}

		FileReader fileReader = null;
		BufferedReader reader = null;
		try
		{
			fileReader = new FileReader(myFile);
			reader = new BufferedReader(fileReader);
			while (true)
			{
				String line = reader.readLine();
				if (line == null) // is reference null (==)
				{
					break;
				}
				else
				{
					System.out.println(line);
				}
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (fileReader != null)
			{
				try
				{
					fileReader.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if (reader != null)
			{
				try
				{
					reader.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}

}

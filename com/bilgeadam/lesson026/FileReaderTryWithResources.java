package com.bilgeadam.lesson026;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTryWithResources
{
	// this file is a better version of file reader example
	
	public static void main(String[] args)
	{
		File myFile = new File("D:\\javalib\\JavaSE Lessons\\com\\bilgeadam\\lesson026\\Second Text File.txt");

		if (!myFile.exists())
		{
			System.err.println("File does not exist");
			System.exit(0);
		}

		try(FileReader fileReader = new FileReader(myFile); BufferedReader reader = new BufferedReader(fileReader))
		{
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
		

	}

}

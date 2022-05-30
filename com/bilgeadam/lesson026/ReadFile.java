package com.bilgeadam.lesson026;

import java.io.FileReader;

public class ReadFile
{

	public static void main(String[] args)
	{

		try
		{
			FileReader input = new FileReader(
					"D:\\javalib\\JavaSE Lessons\\com\\bilgeadam\\lesson026\\Written File.txt");
			char[] array = new char[100];
			input.read(array);
			System.out.println("Data in the file: ");
			System.out.println(array);

			input.close();

		}
		catch (Exception e)
		{
			e.getStackTrace();
		}

	}

}

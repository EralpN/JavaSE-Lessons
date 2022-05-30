package com.bilgeadam.lesson026;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamExample
{

	public static void main(String[] args)
	{
		try
		{
			InputStream input = new FileInputStream("D:\\javalib\\JavaSE Lessons\\com\\bilgeadam\\lesson026\\Second Text File.txt");

			byte[] array = new byte[input.available()];
			input.read(array);
			
			System.out.println("Data read from the file: ");
			
			// Convert byte array into String
			String data = new String(array);
			System.out.println(data);

			input.close();

		}
		catch (Exception e)
		{
			e.getStackTrace();
		}
	}

}

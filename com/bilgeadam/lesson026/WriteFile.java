package com.bilgeadam.lesson026;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile
{

	public static void main(String[] args)
	{
		String data = "This text is the data.";
		
		try (FileWriter output = new FileWriter("D:\\javalib\\JavaSE Lessons\\com\\bilgeadam\\lesson026\\Written File.txt"))
		{
			output.write(data);
			System.out.println("Written File has been created from the data.");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}

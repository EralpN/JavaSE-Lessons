package com.bilgeadam.lesson026.object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutput
{

	public static void main(String[] args)
	{
		Dog dog = new Dog("Coco", "Shih-Tzu");

		try
		{
			FileOutputStream file = new FileOutputStream("D:\\javalib\\JavaSE Lessons\\com\\bilgeadam\\lesson026\\object\\dog.txt");
			ObjectOutputStream output = new ObjectOutputStream(file);

			output.writeObject(dog);

			FileInputStream fileStream = new FileInputStream("D:\\javalib\\JavaSE Lessons\\com\\bilgeadam\\lesson026\\object\\dog.txt");
			ObjectInputStream input = new ObjectInputStream(fileStream);

			Dog newDog = (Dog) input.readObject();

			System.out.println("Dog name and breed: " + newDog.name + " " + newDog.breed);

			output.close();
			input.close();
		}
		catch (Exception e)
		{
			e.getMessage();
		}

	}

}

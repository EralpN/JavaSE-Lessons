package com.bilgeadam.lesson031.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CHClient
{

	public static void main(String[] args)
	{
		try (Socket socket = new Socket("localhost", 3333); 
			DataInputStream din = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			Scanner askString = new Scanner(System.in);)
		{
			
			while (true)
			{
				System.out.println(din.readUTF());
				String line = askString.nextLine();
				dos.writeUTF(line);
				
				if (line .equalsIgnoreCase("exit"))
				{
					System.out.println("Connection closed.");
					break;
				}
				
				String received = din .readUTF();
				System.out.println(received);
			}
	
		}
		catch (UnknownHostException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		

	}

}

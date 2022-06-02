package com.bilgeadam.lesson031.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class CHServer
{

	public static void main(String[] args)
	{
		try (ServerSocket serverSocket = new ServerSocket(3333))
		{
			
			while (true)
			{
				Socket socket = null;
				
				socket = serverSocket.accept();
				System.out.println("A new client is connected: " + socket.getPort());
				
				DataInputStream din = new DataInputStream(socket.getInputStream());
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
				
				System.out.println("Assigning new thread for this client.");
				
				Thread thread = new ClientHandler(din, dos, socket);
				
				thread.start();
			}
			
			
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}

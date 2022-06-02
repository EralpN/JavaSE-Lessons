package com.bilgeadam.lesson031;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{

	public static void main(String[] args)
	{
		System.out.println("Server start.");
		
		int port = 4711;
		
		try (ServerSocket serverSocket = new ServerSocket(port))
		{
			Socket socket = serverSocket.accept(); // waits for a connection
			System.out.println("Connection started from port " + socket.getPort());
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Server stop.");

	}

}

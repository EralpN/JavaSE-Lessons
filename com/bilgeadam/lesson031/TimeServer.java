package com.bilgeadam.lesson031;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class TimeServer
{
	private int port;
	
	public static void main(String[] args)
	{
		TimeServer server = new TimeServer();
		
		// This program runs with port number as an argument
		// 4711
		if (args.length == 1)
		{
			server.port = Integer.parseInt(args[0]);
		}
		else
		{
			System.err.println("Please define a server port!");
		}
		
		server.serve();
	}

	private void serve()
	{
		
		try (ServerSocket serverSocket = new ServerSocket(this.port))
		{
			System.out.println("Server open with port " + this.port);
			
			while (true)
			{
				Socket socket = serverSocket.accept();
				System.out.println("New client connceted with port " + socket.getPort());
				
				OutputStream outgoingInfo = socket.getOutputStream();
				
				PrintWriter sender = new PrintWriter(outgoingInfo, true); // true means it flushes after every input
				
				sender.println(LocalDateTime.now()); // Sends current time
			}
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}

}

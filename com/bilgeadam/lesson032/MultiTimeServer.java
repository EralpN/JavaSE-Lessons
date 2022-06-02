package com.bilgeadam.lesson032;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class MultiTimeServer implements Runnable
{
	private int port;
	private Socket socket;
	
	public static void main(String[] args)
	{
		MultiTimeServer server = new MultiTimeServer();
		
		// This program runs with port number as an argument
		// 4711
		if (args.length == 1)
		{
			server.port = Integer.parseInt(args[0]);
		}
		else
		{
			System.out.println("Port not defined, open with default port 4711.");
			server.port = 4711;
		}
		
		server.serve();
	}

	private void serve()
	{
		
		try (ServerSocket serverSocket = new ServerSocket(this.port))
		{
			while (true)
			{
				System.out.println("Server open with port " + this.port);
				this.socket = serverSocket.accept();
				System.out.println("New client connceted with port " + socket.getPort());
				Thread thread = new Thread(this); // can put another class that implements runnable
				thread.start();
			}		
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void run()
	{
		
		try (OutputStream outgoingInfo = socket.getOutputStream())
		{
		PrintWriter sender = new PrintWriter(outgoingInfo, true); // true means it flushes after every input
		
		for (int i = 0; i < 10; i++)
		{
			sender.println(LocalDateTime.now().toString()); // Sends current time
			Thread.sleep(3000);
		}
		}
		catch (IOException | InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}

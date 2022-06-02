package com.bilgeadam.lesson031;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TimeClient
{

	private String host;
	private int port;
	
	// This program runs with localhost and port number as arguments
	// localhost 4711
	
	public static void main(String[] args)
	{
		TimeClient client = new TimeClient();
		
		if (args.length == 2)
		{
			client.host = args[0];
			client.port = Integer.parseInt(args[1]);
		}
		else
		{
			System.err.println("Please enter ip and port before running the client.");
		}

		client.process();
		
	}

	private void process()
	{
		try (Socket socket = new Socket(this.host, this.port))
		{
			InputStream incomingInfo = socket.getInputStream();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(incomingInfo));
			
			while (true)
			{
				String info = reader.readLine();
				System.out.println(info);
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

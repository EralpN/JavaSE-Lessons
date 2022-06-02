package com.bilgeadam.lesson032;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class MultiTimeClient
{

	private String host;
	private int port;
	
	// This program runs with localhost and port number as arguments
	// localhost 4711
	
	public static void main(String[] args)
	{
		MultiTimeClient client = new MultiTimeClient();
		
		if (args.length == 2)
		{
			client.host = args[0];
			client.port = Integer.parseInt(args[1]);
		}
		else
		{
			System.out.println("IP and port not defined, connecting to default localhost with port 4711.");
			client.host = "127.0.0.1";
			client.port = 4711;
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
				if (info == null)
				{
					break;
				}
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

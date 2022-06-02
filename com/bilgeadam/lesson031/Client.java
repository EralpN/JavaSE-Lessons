package com.bilgeadam.lesson031;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client
{

	public static void main(String[] args)
	{
		System.out.println("Client start");
		
		String hostName = "localhost"; // 127.0.0.1 same thing
		int port = 4711; // 0 to 65535
		
		try(Socket socket = new Socket(hostName, port))
		{
		}
		catch (UnknownHostException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Client stop");

	}

}

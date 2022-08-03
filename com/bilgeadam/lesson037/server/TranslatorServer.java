package com.bilgeadam.lesson037.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.bilgeadam.lesson037.server.commons.Commons;
import com.bilgeadam.lesson037.server.commons.Translator;

public class TranslatorServer
{
	
	public static void main(String[] args)
	{

		if (args.length != 1)
		{
			System.err.println("Please enter server.properties path in run configurations.");
			System.exit(-1);
		}
		Commons.getInstance().setArguments(args[0]);
		
		TranslatorServer server = new TranslatorServer();
		server.communicate();
	}

	private void communicate()
	{
		try (ServerSocket serverSocket = new ServerSocket(Commons.getInstance().getPortNumber()))
		{
			System.out.println(Commons.getInstance().getPortNumber() + " port open.");
			
			while (true)
			{
				Socket socket = serverSocket.accept();
				Translator translator = new Translator(socket);
				Thread thread = new Thread(translator);
				thread.start();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}

}

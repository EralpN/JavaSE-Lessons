package com.bilgeadam.lesson037.client;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import com.bilgeadam.important.BAUtil;

public class TranslatorClient
{

	public static void main(String[] args)
	{
		BAUtil.header("Translator Client");
		
		if (args.length != 1)
		{
			System.err.println("Please enter client.properties path in run configurations.");
			System.exit(-1);
		}
		Commons.getInstance().setArguments(args[0]);
		
		TranslatorClient client = new TranslatorClient();
		client.translate();
		
		BAUtil.footer();
	}

	private void translate()
	{
		try (Socket socket = new Socket(Commons.getInstance().getServerAddress(), Commons.getInstance().getPortNumber()))
		{
			//sends input
			OutputStream os = socket.getOutputStream();
			PrintWriter sender = new PrintWriter(os, true);
			
			//reads output
			InputStream incomingInfo = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(incomingInfo));
			
			String phrase = null;
			String targetLang = null;
			
			while (true)
			{
				phrase = BAUtil.readString("Word to be translated (0 to exit): ");
				if (phrase.equalsIgnoreCase("0"))
				{
					break;
				}
				targetLang = BAUtil.readString("Target Language (TR/DE/JP): ");
				sender.println(phrase + "|" + targetLang);
				
				String output = reader.readLine();
				System.out.println("Translation of " + phrase + " " + "(" + targetLang + ") is " + output + ".");
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

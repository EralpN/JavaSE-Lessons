package com.bilgeadam.lesson037.server.commons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;

public class Translator implements Runnable
{

	private Socket socket;

	public Translator(Socket socket)
	{
		this.socket = socket;
	}

	@Override
	public void run()
	{
		System.out.println("New connection from " + socket.getPort());

		try (OutputStream os = socket.getOutputStream(); InputStream is = socket.getInputStream())
		{
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			PrintWriter sender = new PrintWriter(os, true);

			while (true)
			{
				String text = reader.readLine();
				if (text != null)
				{
					System.out.println(text);
					StringTokenizer tokenizer = new StringTokenizer(text, "|");
					String textToTranslate = tokenizer.nextToken();
					String targetLanguage = tokenizer.nextToken();

					sender.println(Commons.getInstance().getTranslation(textToTranslate, targetLanguage));
				}
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}

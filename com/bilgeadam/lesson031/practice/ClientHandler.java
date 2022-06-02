package com.bilgeadam.lesson031.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientHandler extends Thread
{

	DateFormat fordate = new SimpleDateFormat("yyyy/MM/dd");
	DateFormat fortime = new SimpleDateFormat("hh:mm:ss");

	DataInputStream din;
	DataOutputStream dos;
	Socket socket;

	public ClientHandler(DataInputStream din, DataOutputStream dos, Socket socket)
	{
		this.din = din;
		this.dos = dos;
		this.socket = socket;
	}

	@Override
	public void run()
	{
		String received;
		String returnValue;

		while (true)
		{
			try
			{
				dos.writeUTF("Date or Time? (exit to exit)");
				received = din.readUTF();

				if (received.equalsIgnoreCase("Exit"))
				{
					this.socket.close();
					System.out.println("Connection closed.");
					break;
				}

				Date date = new Date();

				switch (received.toLowerCase())
				{
				case "date":
					returnValue = fordate.format(date);
					dos.writeUTF(returnValue);
					break;
				case "time":
					returnValue = fortime.format(date);
					dos.writeUTF(returnValue);
					break;
				default:
					dos.writeUTF("Invalid Value");
					break;
				}
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}

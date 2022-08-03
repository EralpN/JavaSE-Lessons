package com.bilgeadam.lesson042;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgresqlTest
{

	public static void main(String[] args)
	{
		String url = "jdbc:postgresql://127.0.0.1:5432/northwind";
		
		try
		{
			Connection connection = DriverManager.getConnection(url, "postgres", "eralp");
			Statement statement = connection.createStatement();
			
			String sqlCommand = "SELECT * FROM products;";
			
			ResultSet resultSet = statement.executeQuery(sqlCommand);
			
			int size = resultSet.getMetaData().getColumnCount();
			
			for (int i = 0; i < size; i++)
			{
				System.out.print(resultSet.getMetaData().getColumnLabel(i + 1) + "  ");
			}
			System.out.println();
			
			while(resultSet.next())
			{
				for (int i = 0; i < size; i++)
				{
					System.out.print(resultSet.getString(i + 1) + "  ");
				}
				System.out.println();
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
//	public Connection connect()
//	{
//		Connection connection = null;
//		try
//		{
//			connection = DriverManager.getConnection(url, username, password);
//			return connection;
//		}
//		catch (SQLException e)
//		{
//			e.printStackTrace();
//		}
//		return connection;
//	}
}

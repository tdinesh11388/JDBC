package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection
{
	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/m8";
			Connection con=DriverManager.getConnection
					(url,"root","root");
			System.out.println("Connected");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}

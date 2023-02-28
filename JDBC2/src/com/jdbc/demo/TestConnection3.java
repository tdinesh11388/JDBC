package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class TestConnection3
{
	public static void main(String[] args)
	{
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			String url="jdbc:mysql://localhost:3306/wakanda?user=root&password=root";
			Connection connection = DriverManager.getConnection(url);
			
			System.out.println("Connected");
			
			Statement cs = connection.createStatement();
			
			String query="INSERT INTO customer(id, name, email, age,address) VALUES (104,'xer','erz@18',64,'djs')";
			
			int res=cs.executeUpdate(query);//executeUpdate method returns integer type.
			//boolean execute = cs.execute(query); //execute method return type is boolean
			System.out.println("rows added= "+res);
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

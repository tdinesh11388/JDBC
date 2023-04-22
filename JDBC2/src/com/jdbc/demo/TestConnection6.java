package com.jdbc.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class TestConnection6
{
	public static void main(String[] args) 
	{
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			String url="jdbc:mysql://localhost:3306/wakanda";
			
			FileInputStream file=new FileInputStream("mydbinfo.properties");
			Properties p=new Properties();
			p.load(file);
			
			Connection connection = DriverManager.getConnection(url,p);
			System.out.println("Connected");
			
		} catch (SQLException | FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

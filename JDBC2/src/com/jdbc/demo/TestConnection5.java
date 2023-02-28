package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;


public class TestConnection5 
{
	public static void main(String[] args)
	{
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			String url="jdbc:mysql://localhost:3306/m8";
			Connection cs=DriverManager.getConnection(url,"root","root");
			System.out.println("Connected");
			Statement s=cs.createStatement();
			String query="INSERT INTO student (id, name, course, email) VALUES (301,'anil','an@123')";
			boolean eq = s.execute(query);
			System.out.println(eq);
			cs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

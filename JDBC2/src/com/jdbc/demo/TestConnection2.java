package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class TestConnection2 {

	public static void main(String[] args)
	{
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			String url="jdbc:mysql://localhost:3306/wakanda";
			String user="root";
			String password="root";
			Connection connection = DriverManager.getConnection(url,user,password);
			
			System.out.println("Connected");
			
			Statement cs = connection.createStatement();
			
			String query="INSERT INTO customer(id, name, email, age,address) VALUES (18,'virat','vr@18',33,'dl')";
			
			boolean res=cs.execute(query);
			
			System.out.println(res);
			
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

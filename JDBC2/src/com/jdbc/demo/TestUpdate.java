package com.jdbc.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;
public class TestUpdate {

	public static void main(String[] args) 
	{

		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			String url="jdbc:mysql://localhost:3306/wakanda?user=root&password=root";
			Connection connection = DriverManager.getConnection(url);
			System.out.println("Connected");
			Statement cs = connection.createStatement();
			String query="SELECT name from customer where id=22";
			//String query="INSERT INTO customer(id,name,email,age,address) VALUES (24,'siva','siva@345',14,'kp')";
			int res=cs.executeUpdate(query);
			System.out.println("udate ="+res);
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}

package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Employee {

	public static void main(String[] args) 
	{
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			String url="jdbc:mysql://localhost:3306/data";
			Connection connection = DriverManager.getConnection(url,"root","root");
			
			Statement cs = connection.createStatement();
			String query="insert into employee (id, name, job, salary) values (101,'manju','javaDEv',200000)";
			
			boolean execute = cs.execute(query);
			
			System.out.println(execute);
			System.out.println("connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package com.jdbc.demo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Test2
{
	public static void main(String[] args)
	{
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			String url="jdbc:mysql://localhost:3306/m8";
			Connection connection = DriverManager.getConnection(url,"root","root");
			
			Statement cs = connection.createStatement();
			
			//String query="update student set email='dinesh@123' where id=1";
			String query="select * from student";
			boolean b = cs.execute(query);
			System.out.println(b);
			ResultSet rs = cs.getResultSet();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
			cs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

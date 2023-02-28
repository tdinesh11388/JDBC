package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class TestConnection4 
{
	public static void main(String[] args)
	{
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			String url="jdbc:mysql://localhost:3306/m8";
			Connection c = DriverManager.getConnection(url,"root","root");
			
			Statement cs = c.createStatement();
			
			String query="select * from student";
			//String query="insert into student (id,name,course,email) values (8,'amo','xyz','amo@134')";
			boolean execute = cs.execute(query);
			System.out.println(execute);
			ResultSet rs = cs.getResultSet();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
			//System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

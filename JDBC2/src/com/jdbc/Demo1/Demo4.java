package com.jdbc.Demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class Demo4 
{
	public static void main(String[] args) 
	{
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			String url="jdbc:mysql://localhost:3306/data";
			
			Connection con = DriverManager.getConnection(url,"root","root");
			System.out.println("Connected");
			
			//String query="insert into employee values(?,?,?,?)";
			String query="delete from employee where id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, 301);
			ps.addBatch();
			ps.setInt(1,501);
			ps.addBatch();
			int[] e = ps.executeBatch();
			//boolean execute = ps.execute();
			//int e = ps.executeUpdate();
			System.out.println(e.length);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

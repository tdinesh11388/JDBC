package com.jdbc.Demo1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class Demo3 {

	public static void main(String[] args) 
	{
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			String url="jdbc:mysql://localhost:3306/data";
			Connection con = DriverManager.getConnection(url,"root","root");
			//Statement cs = con.createStatement();
			String query="insert into employee values(?,?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, 403);
			ps.setString(2, "mohan1");
			ps.setString(3, "java");
			ps.setInt(4,3243);
			ps.addBatch();
			
			ps.setInt(1, 503);
			ps.setString(2, "Revanth1");
			ps.setString(3, "python");
			ps.setInt(4,3243);
			ps.addBatch();
			
			ps.setInt(1, 603);
			ps.setString(2, "sai");
			ps.setString(3, "java");
			ps.setInt(4,3243);
			ps.addBatch();
			
			 int[] res = ps.executeBatch();
			System.out.println(res.length);
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}

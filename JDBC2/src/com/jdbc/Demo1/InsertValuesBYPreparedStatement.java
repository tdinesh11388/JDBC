package com.jdbc.Demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class InsertValuesBYPreparedStatement
{
	public static void main(String[] args) 
	{
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			String url="jdbc:mysql://localhost:3306/data";
			Connection con = DriverManager.getConnection(url,"root","root");
			//Statement cs = con.createStatement();
			String query="select * from employee";
			PreparedStatement ps = con.prepareStatement(query);
			
			boolean res = ps.execute();
			System.out.println(res);
			
			if(res) {
				ResultSet rs = ps.getResultSet();
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
				}
			}
//			ResultSet eq = ps.executeQuery();
//			
//			while(eq.next())
//			{
//				System.out.println(eq.getInt(1)+" "+eq.getString(2)+" "+eq.getString(3)+" "+eq.getInt(4));
//			}
//			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

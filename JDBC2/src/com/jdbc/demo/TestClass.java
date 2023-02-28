package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class TestClass {

	public static void main(String[] args) 
	{
		try {
			//Driver driver=new Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/wakanda";
			Connection con=DriverManager.getConnection(url,"root","root");
			System.out.println("Connected");
			Statement cs = con.createStatement();
			
			String query="Select * from customer";
			
			boolean e = cs.execute(query);
			
			System.out.println(e);
			ResultSet rs =cs.getResultSet();
			System.out.println(rs);
			rs.next();
//			int int1 = rs.getInt(1);
//			String string = rs.getString(2);
//			String string1 = rs.getString(3);
//			int int2 = rs.getInt(4);
//			String string2=rs.getString(5);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
			}
			//System.out.println(int1+","+string+","+string1+","+int2+","+string2);
			cs.close();
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

package com.jdbc.Demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class DeleteValues {

	public static void main(String[] args) 
	{
		try {
			Driver driver =new Driver();
			DriverManager.registerDriver(driver);
			
			String url="jdbc:mysql://localhost:3306/data";
			FileInputStream file=new FileInputStream("mydbinfo1.properties");
			Properties p=new Properties();
			p.load(file);
			
			Connection con = DriverManager.getConnection(url,p);
			Statement cs = con.createStatement();
			String query="delete from employee where name=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, "abc");
			int e = ps.executeUpdate();
			System.out.println(e);
//			ResultSet rs = cs.getResultSet();
//			
//			while(rs.next())
//			{
//				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
//			}
		} catch (SQLException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

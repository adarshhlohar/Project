package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DisplayStudent {

	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/ecart";
			String user= "root";
			String pass = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(url , user , pass);
			
			System.out.println("Connection Established successfully");
			
			Statement st = conn.createStatement();
			
			String query = "SELECT * FROM Student";
			
			ResultSet rs = st.executeQuery(query);  //execute query
			
			while(rs.next()) {
				int id = rs.getInt(1);
			String name = rs.getString(2);
			String email = rs.getString(3);
			String address  = rs.getString(4);
			String edu =  rs.getString(5);
			long phone = rs.getLong(6);
			System.out.println(name + " " + email + " " + id + " " + address + " " + edu + " " + phone);
			}
			
			st.close();
			conn.close();
			System.out.println("Connection closed");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}

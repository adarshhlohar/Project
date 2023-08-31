package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsetIntoStudent {

	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/ecart";
			String user = "root";
			String pass = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(url,user,pass);
			
			System.out.println("Connection Establish successfully");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the name of student");
			String name = sc.next();
			
			System.out.println("Enter the email of student");
			String email = sc.next();
			
			System.out.println("Enter the address of student");
			String address = sc.next();
			
			System.out.println("Enter the edu of student");
			String edu = sc.next();
			
			System.out.println("Enter the phone no of student");
			long phone = sc.nextLong();
			
			String str = "INSERT INTO Student(sname,semail,saddress,sedu,sphone) values(?,?,?,?,?);";
			
			PreparedStatement stmt = conn.prepareStatement(str);
			
			stmt.setString(1, name);
			stmt.setString(2, email);
			stmt.setString(3, address);
			stmt.setString(4, edu);
			stmt.setLong(5, phone);
			
			int i = stmt.executeUpdate();
			
			if(i != 0) {
				System.out.println("inserted successfully");
			}
			else {
				System.out.println("failed");
			}
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}

package com.jdbc;
import java.sql.*;
import java.util.Scanner;


public class TestStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter name");
			String sname = sc.next();
			System.out.println("Enter address");
			String saddress = sc.next();
			System.out.println("Enter email");
			String semail = sc.next();
			System.out.println("Enter Phone");
			long sphone = sc.nextLong();
			System.out.println("Enter education");
			String sedu = sc.next();
//			mention driver class --- mysql 
			Class.forName("com.mysql.cj.jdbc.Driver");
//          establish connection with mysql               
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecart","root","root");
//			Statement object to execute query
			PreparedStatement stmt = conn.prepareStatement("insert into Student(sname,semail,saddress,sedu,sphone) values(?,?,?,?,?);");
			
			stmt.setString(1, sname);
			stmt.setString(2, semail);
			stmt.setString(3, saddress);
			stmt.setString(4,sedu);
			stmt.setLong(5, sphone);

			int i= stmt.executeUpdate();
			if(i!=0) {
				System.out.println("inserted successfully");
			}else {
				System.out.println("failed");
			}

		}catch(Exception e) {
			System.out.println(e);
		}
		sc.close();
	}

}

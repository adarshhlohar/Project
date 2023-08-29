package com.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Helpher {
	static Connection conn;
	public static Connection createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecart","root","root");
		}catch(Exception e) {
			System.out.println(e);
		}
		return conn;
	}
}

package com.hibernate.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcUrl = "jdbc:mysql://localhost:3306/movieratings?useSSL=false";
		String user = "root";
		String pass = "";
		try {
			System.out.println("Connection Successful :" + jdbcUrl);
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection Successful!!!");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}

package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	public static void main(String[] args) {
		try {
			// load and register the Driver class towards JVM
			// This is an optional step from JDBC 4 spec onwards
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dkte_db", "root", "root");
//			if (connection != null)
//				System.out.println("Connection is successful");
//			else
//				System.out.println("Failed...");

			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM user");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " - " + rs.getString(2));
			}
			statement.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

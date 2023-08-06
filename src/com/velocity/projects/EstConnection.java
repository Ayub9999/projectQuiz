package com.velocity.projects;
import java.sql.Connection;
import java.sql.DriverManager;

public class EstConnection {
	Connection connection=null;
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/text", "root", "root");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
	}



}

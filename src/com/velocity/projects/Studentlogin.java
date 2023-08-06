package com.velocity.projects;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Studentlogin {
PreparedStatement ps=null;
	Connection con=null;
public void login() {
	Scanner sc = new Scanner (System. in);
	System.out.println("Enter the username: ");
	String username =sc.next();
	System.out.println("Enter the password");
	String password =sc.next ();
	
	DisplayQuestion d = new DisplayQuestion ();

	try {
		EstConnection connect=new EstConnection();
		con=connect.getConnection();
	PreparedStatement ps= con.prepareStatement ("select * from studententry");
	ResultSet rs = ps.executeQuery() ;
	
	while(rs.next()) {
	
	if(rs.getString(3).equals(username) && (rs.getString(4).equals (password))) {
		System.out.println("Login Successfully !!\n");
		d.display();
	}
	}
		System.out.println("Invalid password Id !!!");
		} catch (Exception e) {
		e.printStackTrace();
}
}
	}


package com.velocity.projects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Fetchstudentdata {
	PreparedStatement ps=null;
	Connection con=null;
public void login() {
	Scanner sc = new Scanner (System. in);
	System.out.println("Enter the username: ");
	String username =sc.next();
	System.out.println("Enter the password");
	String password =sc.next ();
	
try {
		EstConnection connect=new EstConnection();
		con=connect.getConnection();
	PreparedStatement ps= con.prepareStatement ("select * from studententry");
	ResultSet rs = ps.executeQuery() ;
	 
	
	
	while(rs.next()) {
	
	if(rs.getString(3).equals(username) && (rs.getString(4).equals (password))) {
		System.out.println("Login Successfully !!\n");
		System.out.println("id " + rs.getString(9));
		System.out.println("firstname "+rs.getString(1));
		System.out.println("lastname "+rs.getString(2));
		
	}
	}
		
		} catch (Exception e) {
		e.printStackTrace();
}sc.close();
}
	}




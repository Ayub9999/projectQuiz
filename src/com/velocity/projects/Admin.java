package com.velocity.projects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Admin {
	Connection con=null;
	PreparedStatement ps= null;

void getopration() throws SQLException {
		
			EstConnection connect=new EstConnection();
			con=connect.getConnection();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the studentid: ");
			String studentid =sc.next();
			
		  PreparedStatement ps = con.prepareStatement( "select * from text.Studententry");
		 ResultSet rs = ps.executeQuery ();
		 rs.next();
		 System.out.println( "studentid >>"+ rs.getString(9));
	//	System.out.println(" "+rs.getString(1));
	System.out.println("result >>"+rs.getString(8));
		   
}public static void main(String[] args) {
	Admin ad=new Admin();
	try {
		ad.getopration();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
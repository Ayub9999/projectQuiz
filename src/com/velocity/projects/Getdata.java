package com.velocity.projects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Getdata {
	Scanner sc = new Scanner(System.in);
	Connection con=null;
	PreparedStatement ps= null;
	
	void fetch() {
	try { 
			EstConnection connect=new EstConnection();
			con=connect.getConnection();
			
			PreparedStatement ps= con.prepareStatement ("select * from studententry");
			ResultSet rs = ps.executeQuery() ;
		    int count=0;
			for (int i=1; i<=10; i++) { 
			rs.next();
		
		System.out.println("\nQ." +i+ " "+ rs.getString(9));
		System.out.println("A "+rs.getString(1));
		System.out.println("B "+rs.getString(2));
	
}
		} catch (Exception e) {
			
			e.printStackTrace();
			}
}
}


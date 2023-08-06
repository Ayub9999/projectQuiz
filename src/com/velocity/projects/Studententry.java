package com.velocity.projects;
import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import java.util.Scanner;
	import java.util.*;
	public class Studententry  {
		Scanner sc = new Scanner(System.in);
		Connection con=null;
	
		PreparedStatement ps= null;
		

	public void insertStudententry(String firstname,String lastname,String username,String password,String city,String mailid,long mobileno) {
		try {
			
			EstConnection connect=new EstConnection();
			con=connect.getConnection();
			ps=con.prepareStatement("insert into text.Studententry (firstname ,lastname,username,password,city,mailid,mobileno,Result)values(?,?,?,?,?,?,?,?)");
			ps.setString(1, firstname);
			ps.setString(2, lastname);
			ps.setString(3, username);
			ps.setString(4, password);
			ps.setString(5, city);
			ps.setString(6,mailid);
			ps.setLong(7, mobileno);
			int i=ps.executeUpdate();
		System.out.println("Record is inserted Successfully..."+i);	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

		
	public void exicute()  {
		try {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++) {
			System.out.println("Enter the first name>>");
			String firstname=sc.next();
			System.out.println("Enter the last name>>");
			String lastname=sc.next();
			System.out.println("Enter the user name>>");
			String username=sc.next();
			System.out.println("Enter the  password>>");
			String password =sc.next();
			System.out.println("Enter the city name>>");
			String city=sc.next();
			System.out.println("Enter the  mail id>>");
			String mailid=sc.next();
			System.out.println("Enter the mobileno>>");
			long mobileno=sc.nextLong();
			Studententry std=new Studententry();
			std.insertStudententry(firstname, lastname, username, password, city, mailid, mobileno);
				
		}
		sc.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	}

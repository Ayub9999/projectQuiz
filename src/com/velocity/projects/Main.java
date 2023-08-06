package com.velocity.projects;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	public void useroperation()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.Student Registration..");
		System.out.println("2.Student Login");
		System.out.println("3. Display the list of questions");
		System.out.println("4.Display result");
		
		System.out.println("enter ur choice>>");
		int num=sc.nextInt();
		switch(num) {
		
		case 1:
			Studententry std=new Studententry();
		
				std.exicute();
	break;
		case 2:
			Studentlogin std1=new Studentlogin();
			std1.login();
			break;
		case 3:
			DisplayQuestion d = new DisplayQuestion ();
			d.display();
			
	    	break;
		
		}
			
	}
		public void getadmin() {
			Scanner sc=new Scanner(System.in);	
			System.out.println("1)Display Quiz result using first & lastname..");
			System.out.println("2)fetch data  using id");
			System.out.println("3)add the Question in database with 4 option");
		System.out.println("enter ur choice");
		int no=sc.nextInt();
		
		switch(no) {
		

		case 1:
			Fetchstudentdata x=new Fetchstudentdata();
			x.login();
			break;
		case 2:
			Admin ad=new Admin();
			try {
				ad.getopration();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		case 3:
			InsetQuestions ins = new InsetQuestions ();
			ins.ex();
			
			sc.close();
		}
	}
	 
		
	

}
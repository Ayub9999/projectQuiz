package com.velocity.projects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsetQuestions {

		
		PreparedStatement ps= null;
		Connection con=null;
	public void insertNewjava(String Question,String optionA,String optionB,String optionC,String optionD,String correctoption) {
		try {
			
			EstConnection connect=new EstConnection();
			con=connect.getConnection();
			ps=con.prepareStatement ("insert into text. Newjava(Question,optionA,optionB,optionC,optionD,correctoption)values(?,?,?,?,?,?)");
			ps.setString(1, Question);
			ps.setString(2, optionA);
			ps.setString(3, optionB);
			ps.setString(4, optionC);
			ps.setString(5,optionD);
			ps.setString(6,correctoption);
			int i=ps.executeUpdate();
			System.out.println("Record is inserted Successfully..."+i);	
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	public void ex() {
		try {
		Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Question");
			String Question =sc.nextLine();
			System.out.println("Enter the optionA");
			String optionA =sc.nextLine();
			System.out.println("Enter the optionB");
			String optionB =sc.nextLine();
			System.out.println("Enter the optionC");
			String optionC=sc.nextLine();
			System.out.println("Enter the optionD");
			String optionD=sc.nextLine();
			System.out.println("Enter the correctoption");
			String correctoption=sc.next();
			InsetQuestions st=new InsetQuestions();
			st.insertNewjava(Question , optionA, optionB, optionC, optionD, correctoption);
			sc.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		}
	
		
	}
	
	




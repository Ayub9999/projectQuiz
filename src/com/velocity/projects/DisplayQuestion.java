package com.velocity.projects;
import java.util.*;
import java.sql.*;


public class DisplayQuestion {
	Scanner sc = new Scanner(System.in);
	Connection con=null;
	PreparedStatement ps= null;

void display() {
		try { 
			EstConnection connect=new EstConnection();
			con=connect.getConnection();
 PreparedStatement ps = con.prepareStatement( "select * from text.newjava");//fetch the question into database
		    ResultSet rs = ps.executeQuery ();
		    int count=0;
			for (int i=1; i<=10; i++) { 
			rs.next();
		
		System.out.println("\nQ." +i+ " "+ rs.getString(2));
		System.out.println("A "+rs.getString(3));
		System.out.println("B "+rs.getString(4));
		System.out.println("C "+rs.getString (5));
		System.out.println("D "+rs.getString (6));
        System.out.println("Enter your answer:");
        String answer = sc.nextLine(); 
    	String correctoption = rs.getString(7);
		if(correctoption.equals(answer))
		{
		count++;
         }
	     	}

			System.out.println(" Your Answer is Sumbitted !!!");
		System.out.println("YOUR SCORE"+count);//count & display result
		
		PreparedStatement pas = con.prepareStatement( "insert into text.text.Studententry(Result)values (?)");//sql query for strore result in table
		  pas.setInt(1, count);
        pas.executeUpdate();
	
         ps.close();
         rs.close();
      //   pas.executeUpdate ();
	     	
		} catch (Exception e) {
			
		e.printStackTrace();
		}finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
		}
        }
		public static void main(String []args) {
		DisplayQuestion d = new DisplayQuestion ();
		d.display();
	  }

		}

package com.velocity.projects;

import java.util.Scanner;

public class Finalcall {
	public static void main(String[] args) {
System.out.println("******************************************************************************************");
System.out.println("**********************welcome to quiz base Application************************************");
Scanner sc=new Scanner (System.in);

	while(true){

	System.out.println("1.User opration");
	System.out.println("2.Admin opration");
	System.out.println("\n Enter ur choice>>");
	int num=sc.nextInt();
	Main main=new Main();
	switch(num) {
	case 1:
		main.useroperation();
		
		break;
	case 2:
		main.getadmin();
		
		break;


	}
	}

}
}


package com.signify.client;

import java.util.Scanner;
/**
 * @author Naman
 *
 */

public class CRSApplicationMenu {

	static void userLogin()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username : ");
		String name = sc.nextLine();
		System.out.println("Enter Password : ");
		String password = sc.nextLine();
		System.out.println("Enter Role : ");
		String role = sc.nextLine();
		role = role.toLowerCase();
		if(role.equals("admin"))
		{
		   System.out.println();	
		   CRSAdminMenu ad = new CRSAdminMenu();
		   ad.displayMenu();
		}
		else if(role.equals("student"))
		{
			System.out.println();	
			CRSStudentMenu st = new CRSStudentMenu();
			st.displayMenu();
		}
		else if(role.equals("professor"))
		{
			System.out.println();	
			CRSProfessorMenu pro = new CRSProfessorMenu();
			pro.displayMenu();
		}
		else
		{
			System.out.println("Invalid selection!");
		}
		
	}
	
	static void registerForStudent()
	{
		System.out.println("Student is registered");
	}
	static void updatePassword()
	{ 
		System.out.println("Password is updated");
	}
	static void displayApplicationMenu()
	{
		System.out.println("WELCOME TO CRS APPLICATION");
		 System.out.println("==========================");
		 System.out.println();
		 System.out.println("MAIN MENU");
		 System.out.println();
		 System.out.println("1.LOGIN");
		 System.out.println("2.REGISTERATION FOR STUDENT");
		 System.out.println("3.UPADTE PASSWORD");
		 System.out.println("4.EXIT");
		 boolean ex = false;
		 while(!ex)
		 {
			 Scanner sc = new Scanner(System.in);
			 System.out.println();
			 System.out.println("Enter your choice : ");
			 try
			 {
				 int choice = sc.nextInt();
				 switch(choice)
				 {
				   case 1:  userLogin();
				            break;
				   case 2:  registerForStudent();
				            break;
				   case 3:  updatePassword();
				            break;
				   case 4:  System.out.println();
					        System.out.println("THANK YOU FOR VISITING CRS APPLICATION");
					        ex = true;
					        System.exit(0);
					default: System.out.println("Invalid selection");        
				 }	
			 }
			 catch(Exception e)
			 {
				 System.out.println("Exception occurred");
			 }
			 finally
			 {
				 ex = false;  
			 }
		 }
	}
	 public static void main(String args[])
	 {
          displayApplicationMenu();
	 }
}

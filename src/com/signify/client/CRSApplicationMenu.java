package com.signify.client;

import java.util.Scanner;

import com.signify.service.UserService;

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
	static UserService us1 = new UserService();
	static void registerForUser()
	{
	    us1.createUser();
	}
	static void updateUser()
	{ 
		System.out.println("Enter the user ID for updation : ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
	    us1.updateUser(id);
	}
	static void viewUser()
	{
		System.out.println("Enter the user ID to view information : ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
	    us1.viewUser(id);
	}
	static void displayApplicationMenu()
	{
		System.out.println("WELCOME TO CRS APPLICATION");
		 System.out.println("==========================");
		 System.out.println();
		 System.out.println("MAIN MENU");
		 System.out.println();
		 System.out.println("1.LOGIN");
		 System.out.println("2.REGISTERATION FOR USER");
		 System.out.println("3.UPADTE USER DETAILS");
		 System.out.println("4.VIEW USER DETAILS");
		 System.out.println("5.EXIT");
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
				   case 2:  registerForUser();
				            break;
				   case 3:  updateUser();
				            break;
				   case 4:  viewUser();
		                    break;
				   case 5:  System.out.println();
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

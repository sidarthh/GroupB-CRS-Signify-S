/**
 * 
 */
package com.signify.client;

import java.util.Scanner;

/**
 * @author Naman
 *
 */
public class CRSAdminMenu {

	static void approveToStudent()
	{
	   System.out.println("Student is approved");	
	}
	static void addCourse()
	{
		System.out.println("Course is added");	
	}
	static void addAdmin()
	{
		System.out.println("New admin has been added");	
	}
	static void displayMenu()
	{
		 System.out.println("WELCOME TO ADMIN MENU");
		 System.out.println("==========================");
		 System.out.println();
		 System.out.println("1.APPROVE TO STUDENT");
		 System.out.println("2.ADD COURSE");
		 System.out.println("3.ADD ADMIN");
		 System.out.println("4.EXIT");
		 boolean ex = false;
		 while(!ex)
		 {
			 Scanner sc = new Scanner(System.in);
			 System.out.println();
			 System.out.println("Enter your choice : ");
			 int choice = sc.nextInt();
			 try
			 {
				 switch(choice)
				 {
				   case 1:  approveToStudent();
				            break;
				   case 2:  addCourse();
				            break;
				   case 3:  addAdmin();
				            break;
				   case 4: System.out.println();
					        System.out.println("THANK YOU FOR VISITING ADMIN MENU");
					        System.out.println();
					        ex = true;
					        CRSApplicationMenu obj = new CRSApplicationMenu();
					        obj.displayApplicationMenu();
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
}

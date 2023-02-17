/**
 * 
 */
package com.signify.client;

import java.util.Scanner;

import com.signify.service.StudentInterface;
import com.signify.service.StudentService;

/**
 * @author Naman
 *
 */
public class CRSStudentMenu {

	static void registerForCourse()
	{
	   System.out.println("Currently no course is available");	
	}
	static void viewGrades()
	{
		System.out.println("Currently no grades are available");	
	}
	static void studentDetails()
	{
		System.out.println("Currently no student details are available");	
	}
	static void displayMenu() {
		 System.out.println("WELCOME TO STUDENT MENU");
		 System.out.println("==========================");
		 System.out.println();
		 System.out.println("1.REGISTER");
		 System.out.println("2.CHANGE PASSWORD");
		 System.out.println("3.VIEW GRADE CARD");
		 System.out.println("4.EXIT");
		 boolean ex = false;
		 Scanner sc = new Scanner(System.in);
		 StudentInterface si = new StudentService();
		 while(!ex)
		 {
			 System.out.println();
			 System.out.println("Enter your choice : ");
			 int choice = sc.nextInt();
			 try
			 {
				 
				 switch(choice)
				 {
				   case 1:  si.register();
				            break;
				   case 2:  si.changePassword();
				            break;
				   case 3:  si.viewGradeCard();
				            break;
				   case 4:  System.out.println();
					        System.out.println("THANK YOU FOR VISITING STUDENT MENU");
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

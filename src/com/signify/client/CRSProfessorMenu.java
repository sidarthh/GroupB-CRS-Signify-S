/**
 * 
 */
package com.signify.client;

import java.util.Scanner;

/**
 * @author Naman
 *
 */
public class CRSProfessorMenu {

	static void addCourse()
	{
	   System.out.println("Course is added");	
	}
	static void viewEnrolledStudents()
	{
		System.out.println("No student has enrolled yet");	
	}
	static void addGrades()
	{
		System.out.println("Grades have been added");	
	}
	static void displayMenu() {
		 System.out.println("WELCOME TO PROFESSOR MENU");
		 System.out.println("==========================");
		 System.out.println();
		 System.out.println("1.ADD COURSE");
		 System.out.println("2.VIEW ENROLLED STUDENTS");
		 System.out.println("3.ADD GRADES");
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
				   case 1:  addCourse();
				            break;
				   case 2:  viewEnrolledStudents();
				            break;
				   case 3:  addGrades();
				            break;
				   case 4: System.out.println();
					        System.out.println("THANK YOU FOR VISITING PROFESSOR MENU");
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

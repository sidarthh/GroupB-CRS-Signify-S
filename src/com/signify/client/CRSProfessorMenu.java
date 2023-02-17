/**
 * 
 */
package com.signify.client;

import java.util.Scanner;

import com.signify.service.ProfessorInterface;
import com.signify.service.ProfessorService;

/**
 * @author Naman
 *
 */
public class CRSProfessorMenu {

	static void displayMenu() {
		 System.out.println("WELCOME TO PROFESSOR MENU");
		 System.out.println("==========================");
		 System.out.println();
		 System.out.println("1.ADD COURSE");
		 System.out.println("2.VIEW ENROLLED STUDENTS");
		 System.out.println("3.ADD GRADES");
		 System.out.println("4.EXIT");
		 boolean ex = false;
		 Scanner sc = new Scanner(System.in);
		 ProfessorInterface pi = new ProfessorService();
		 while(!ex)
		 {
			 System.out.println();
			 System.out.println("Enter your choice : ");
			 int choice = sc.nextInt();
			 try
			 {
				 switch(choice)
				 {
				   case 1:  pi.addCourse();
				            break;
				   case 2:  pi.viewEnrolledStudents();
				            break;
				   case 3:  pi.addGrade();
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

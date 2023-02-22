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

	static public void displayMenu() {
		 System.out.println("WELCOME TO PROFESSOR MENU");
		 System.out.println("==========================");
		 System.out.println();
		 System.out.println("1.VIEW ENROLLED STUDENTS");
		 System.out.println("2.ADD GRADES");
		 //System.out.println("3.");
		 System.out.println("3.EXIT");
		 boolean ex = false;
		 Scanner sc = new Scanner(System.in);
		 //ProfessorDAOInterface pi = new ProfessorDAOImplementation();
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
				   
				   case 1:  
					        System.out.println("Enter your professor ID:");
					        int id = sc.nextInt();
					        pi.viewEnrolledStudents(id);
				            break;
				            
				   case 2:  
					        System.out.println("Enter Student ID you want to grade for:");
					        int idd = sc.nextInt();
					  
					        pi.addGrade(idd);
				            break;
				   case 3: System.out.println();
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

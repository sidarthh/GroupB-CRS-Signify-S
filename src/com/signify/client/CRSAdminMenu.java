/**
 * 
 */
package com.signify.client;

import java.util.Scanner;

import com.signify.bean.*;
import com.signify.service.AdminInterface;
import com.signify.service.AdminService;

/**
 * @author Naman
 *
 */
public class CRSAdminMenu {
	static public void displayMenu()
	{
		 System.out.println("WELCOME TO ADMIN MENU");
		 System.out.println("==========================");
		 System.out.println();
		 System.out.println("1.ADD PROFESSOR");
		 System.out.println("2.ASSIGN COURSE");
		 System.out.println("3.APPROVE STUDENT");
		 System.out.println("4.ADD ADMIN");
		 System.out.println("5.EXIT");
		 boolean ex = false;
		 Scanner sc = new Scanner(System.in);
		 AdminInterface ad = new AdminService();
		 while(!ex)
		 {
			 System.out.println();
			 System.out.println("Enter your choice : ");
			 int choice = sc.nextInt();
			 try
			 {
				 switch(choice)
				 {
				   case 1:  Professor prof = new Professor(); 
				   			prof.setName("Prof1");
				   			prof.setPassword("p");
				   			prof.setRole("professor");
				   			prof.setUserId(101);
					        ad.addProfessor(prof);
					        System.out.println("Professor Added");
				            break;
				   case 2:  ad.assignCourse();
				            break;
				   case 3:  ad.approveStudent();;
				            break;
				   case 4:  ad.addAdmin();
					        break;         
				   case 5:  System.out.println();
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

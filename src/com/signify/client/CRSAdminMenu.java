/**
 * 
 */
package com.signify.client;

import java.sql.Date;
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
		 System.out.println("1.VIEW USER DETAILS");
		 System.out.println("2.EDIT USER DETAILS");
		 System.out.println("3.ADD PROFESSOR");
		 System.out.println("4.ADD ADMIN");
		 System.out.println("5.ADD COURSE");
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
				   case 1:  System.out.println("Enter the user ID to view information : ");
			                int id = sc.nextInt();
			                ad.viewInfo(id);
                            break;
				   case 2:  System.out.println("Enter user ID to edit : ");
				            id = sc.nextInt();
				            int val = 0;
				            System.out.println("Which paramter you want to change : ");
				            System.out.println("1.Name");
				            System.out.println("2.Password");
				            System.out.println("3.Role");
				            System.out.println("Select paramter : ");
				            val = sc.nextInt();
					        ad.editUser(id,val);
				            break;
				   case 3:  ad.approveStudent();;
				            break;
				   case 4:  Professor prof = new Professor();
				            System.out.println("Enter professor name : ");
				            String name = sc.next();
				            System.out.println("Enter department : ");
				            String department = sc.next();
				            System.out.println("Enter designation : ");
				            String designation = sc.next();
				            prof.setName(name);
				            prof.setDepartment(department);
				            prof.setDesignation(designation);
				            prof.setRole("professor");
					        ad.addProfessor(prof);
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

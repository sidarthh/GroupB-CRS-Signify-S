package com.signify.client;


import java.util.*;
import java.util.Scanner;

import com.signify.bean.User;
import com.signify.service.UserService;

/**
 * @author Naman
 *
 */

public class CRSApplicationMenu {
	
	static UserService us1 = new UserService();
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
		 System.out.println("5.LIST USER DETAILS");
		 System.out.println("6.DELETE USER");
		 System.out.println("7.EXIT");
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
				   case 1:  System.out.println("Enter Username : ");
				            String enter_ch = sc.nextLine();
							String name = sc.nextLine();
							System.out.println("Enter Password : ");
							String password = sc.nextLine();
							System.out.println("Enter Role : ");
							String role = sc.nextLine();
							role = role.toLowerCase();
					        us1.userLogin(role);
				            break;
				   case 2:  System.out.println("Enter username : ");
				            enter_ch = sc.nextLine();
				            name = sc.nextLine();
				            System.out.println("Enter role : ");
				            role = sc.nextLine();
				            System.out.println("Enter password : ");
				            password = sc.nextLine();
					        us1.registerForUser(name,role,password);
				            break;
				   case 3:  System.out.println("Enter the user ID for updation : ");
				            int id = sc.nextInt();
				            System.out.println("Which parameter you want to change : ");
					   		System.out.println("1.Username");
					   		System.out.println("2.Role");
					   		System.out.println("3.Password");
				   		    int choiceParam = sc.nextInt();
				   		    switch(choiceParam)
							  {
							    case 1 : System.out.println("Set new username : ");
							             String ch = sc.nextLine();
							             String newName = sc.nextLine(); 
							             us1.updateUser1(id,newName);;
							             break;
							    case 2 : System.out.println("Set new role : ");
					                     String newRole = sc.nextLine(); 
					                     us1.updateUser2(id,newRole);
					                     break;	   
							    case 3 : System.out.println("Set new password : ");
					                     String newPassword = sc.nextLine(); 
					                     us1.updateUser3(id,newPassword);
					                     break;
							    default : System.out.println("Invalid selection");
							 }
				            break;
				   case 4:  System.out.println("Enter the user ID to view information : ");
					        id = sc.nextInt();
					        us1.viewUser(id);
		                    break;
				   case 5:  us1.viewListUser();
				            break;
				   case 6:  System.out.println("Enter the user ID to delete : ");
					        id = sc.nextInt();
				            us1.deleteUser(id);
				            break;
				   case 7:   System.out.println();
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

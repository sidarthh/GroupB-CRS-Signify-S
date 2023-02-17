/**
 * 
 */
package com.signify.service;

import java.util.Scanner;

import com.signify.bean.User;

/**
 * @author Naman
 *
 */
public class UserService {
	 
	 private User u[];
	 static private int count;
	 public UserService()
	 {
		 u = new User[]{new User(),new User(),new User(),new User(),new User()};
		 count = 0;
	 }
	 public void createUser()
	 {
		 u[count].setUserId(count); 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter username : ");
		 String username = sc.nextLine();
		 u[count].setName(username);
		 System.out.println("Enter role : ");
		 String role = sc.nextLine();
		 u[count].setRole(role);
		 System.out.println("Enter password : ");
		 String password = sc.nextLine();
		 u[count].setPassword(password);
		 System.out.println("New user created successfully !!! with user id "+count);
		 count++;
	 }
	 public void deleteUser(int id)
	 {
		 u[id].setName(null);
		 u[id].setRole(null);
		 u[id].setPassword(null);
	 }
	 public void updateUser(int id)
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Which parameter you want to change : ");
		 System.out.println("1.Username");
		 System.out.println("2.Role");
		 System.out.println("3.Password");
		 int choice = sc.nextInt();
		 switch(choice)
		 {
		    case 1 : System.out.println("Set new username : ");
		             String ch = sc.nextLine();
		             String newName = sc.nextLine(); 
		             u[id].setName(newName);
		             break;
		    case 2 : System.out.println("Set new role : ");
                     String newRole = sc.nextLine(); 
                     u[id].setName(newRole);
                     break;	   
		    case 3 : System.out.println("Set new password : ");
                     String newPassword = sc.nextLine(); 
                     u[id].setName(newPassword);
                     break;
		    default : System.out.println("Invalid selection");
		 }
	 }
	 public void viewUser(int id)
	 {
		 if(u[id].getName()==null)
		 {
			 System.out.println("No such user exist");
			 return;
		 }
		 System.out.println("Username is : "+u[id].getName());
		 System.out.println("UserId is : "+(count-1));
		 System.out.println("Role is : "+u[id].getRole());
		 System.out.println("Password is : "+u[id].getPassword());
	 }
}
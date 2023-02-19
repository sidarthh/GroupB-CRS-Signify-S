/**
 * 
 */
package com.signify.service;

import java.util.*;
import java.util.Scanner;

import com.signify.bean.User;
import com.signify.client.CRSAdminMenu;
import com.signify.client.CRSProfessorMenu;
import com.signify.client.CRSStudentMenu;

/**
 * @author Naman
 *
 */
public class UserService implements UserInterface{
	 
	 private List<User> ul = new ArrayList<User>();
	 
	 public void userLogin(String role)
		{
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
		
	 public void registerForUser(String name,String role,String password)
	 {
		 User u = new User();
		 u.setUserId(ul.size()+1); 
		 u.setName(name);
		 u.setRole(role);
		 u.setPassword(password);
		 ul.add(u);
	 }
	 public void deleteUser(int id)
	 {
		 for(User u : ul) {
			 if(u.getUserId()==id) {
				 ul.remove(u);
				 return;
			 }
		 }
		 System.out.println("User deleted with id "+id);
	 }
	 public void updateUser1(int id,String newName)
	 {
		 for(User u : ul) {
			 if(u.getUserId()==id) {
				 u.setName(newName);
				 break;
			 }
		 }
	 }
	 public void updateUser2(int id,String newRole)
	 {
		 for(User u : ul) {
			 if(u.getUserId()==id) {
				 u.setRole(newRole);
				 break;
			 }
		 }
	 }
	 public void updateUser3(int id,String newPassword)
	 {
		 for(User u : ul) {
			 if(u.getUserId()==id) {
				 u.setPassword(newPassword);
				 break;
			 }
		 }
	 }
	 public void viewUser(int id)
	 {
		 for(User u : ul) {
			 if(u.getUserId()==id) {
				 System.out.println(u);
			 }
		 }
	 }
	 public void viewListUser()
	 {
		 System.out.println(ul);
	 }
}
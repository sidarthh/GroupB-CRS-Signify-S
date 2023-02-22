/**
 * 
 */
package com.signify.service;

import java.util.*;
import java.util.Scanner;

import com.signify.bean.Student;
import com.signify.bean.User;
import com.signify.client.CRSAdminMenu;
import com.signify.client.CRSProfessorMenu;
import com.signify.client.CRSStudentMenu;
import com.signify.dao.StudentDAOImplementation;
import com.signify.dao.StudentDAOInterface;
import com.signify.dao.UserDAOImplementation;
import com.signify.dao.UserDAOInterface;

/**
 * @author Naman
 *
 */
public class UserService implements UserInterface{
	 
	 UserDAOInterface userDao = new UserDAOImplementation();
	 public void userLogin(int userID,String password,String role)
		{
		    boolean result = userDao.validate(userID,password,role);
			if(result==true)
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
			}
			else
			{
				System.out.println("");
			}	
		}
	 public void updatePassword(int id,String oldpass,String newpass)
	 {
		 userDao.updateDAOPassword(id,oldpass,newpass); 
	 }
}
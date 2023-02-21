/**
 * 
 */
package com.signify.service;

import java.util.*;

import com.signify.bean.*;
import com.signify.dao.AdminDAOImplementation;
import com.signify.dao.AdminDAOInterface;

/**
 * @author asus
 *
 */
public class AdminService implements AdminInterface{
	
	List<Professor> profs = new ArrayList<Professor>();
	AdminDAOInterface ad = new AdminDAOImplementation();
	public void assignCourse() {
		System.out.println("Course is assigned");
	}
	public void approveStudent() {
		System.out.println("Student is approved");
	}
	public void addAdmin() {
		System.out.println("Admin is added");
	}
	public void viewInfo(int id,int val)
	{
		ad.editDAOInfo(id,val);
	}
	public void addProfessor(Professor obj)
	{
		
	}
	public void editUser(int id,int val)
	{
		
	}
}
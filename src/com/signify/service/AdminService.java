/**
 * 
 */
package com.signify.service;

import java.util.*;

import com.signify.bean.*;

/**
 * @author asus
 *
 */
public class AdminService implements AdminInterface{
	
	List<Professor> profs = new ArrayList<Professor>();
	
	public void addProfessor(Professor prof) {
		profs.add(prof);
	}
	public void assignCourse() {
		System.out.println("Course is assigned");
	}
	public void approveStudent() {
		System.out.println("Student is approved");
	}
	public void addAdmin() {
		System.out.println("Admin is added");
	}
}
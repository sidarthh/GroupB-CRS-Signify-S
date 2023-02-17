/**
 * 
 */
package com.signify.service;

/**
 * @author asus
 *
 */
public class AdminService implements AdminInterface{

	public void addProfessor() {
		System.out.println("Professor added");
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
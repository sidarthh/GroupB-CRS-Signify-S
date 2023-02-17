/**
 * 
 */
package com.signify.service;

/**
 * @author Naman
 *
 */
public class StudentService implements StudentInterface {

	public void changePassword()
	{
		System.out.println("Password changed......");
	}
	public void register()
	{
		System.out.println("Student is registered");
	}
	public void viewGradeCard()
	{
		System.out.println("Currently no grade cards are available");
	}
}
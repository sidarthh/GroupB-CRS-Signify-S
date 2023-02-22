/**
 * 
 */
package com.signify.service;

import com.signify.dao.ProfessorDAOImplementation;

/**
 * @author Naman
 *
 */
public class ProfessorService implements ProfessorInterface{
	ProfessorDAOImplementation professor = new ProfessorDAOImplementation();

	
	public void viewEnrolledStudents(int id) 
	{
		professor.viewEnrolledStudents(id);
		//System.out.println("Currently no student have enrolled");
	}
	public void addGrade(int id)
	{
		professor.addgrades(id);
		System.out.println("Grade is added");
	}
}
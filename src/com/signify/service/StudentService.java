/**
 * 
 */
package com.signify.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.signify.bean.Student;
import com.signify.bean.User;
import com.signify.dao.StudentDAOImplementation;
import com.signify.dao.StudentDAOInterface;

/**
 * @author Naman
 *
 */
public class StudentService implements StudentInterface {

	
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	 static final String DB_URL = "jdbc:mysql://localhost/src";

	   //  Database credentials
	 static final String USER = "root";
	 static final String PASS = "shinamangarg2001";
	
	
	List<Student>s1 = new ArrayList<Student>();
	public Map<String,Integer>courses = new HashMap<String,Integer>();
	
	StudentDAOInterface studentDao = new StudentDAOImplementation();
	public StudentService()
	{
	}
	public void myInfo(int id)
	{
		studentDao.viewDAOInfo(id);
	}
	public void viewCourses() 
	{
		studentDao.viewDAOCourses();
		//		Iterator<String> it = courses.keySet().iterator();       //keyset is a method  
//        int count = 1;
//		while(it.hasNext())  
//        {  
//            String key = (String)it.next(); 
////            System.out.println("Roll no.: "+key+"     name: "+hm.get(key));  
//            System.out.println(count+"."+key+":"+courses.get(key));
//            count++;
//        } 	
	}
	public void registerForStudent(String name,String password,String branch,int batch)
	{
		studentDao.registerDAOStudent(name,password,branch, batch);
	}
	public void payFee(String mode)
	{
		System.out.println("Fee has been paid through "+mode+" mode");
	}
	public void register(String course)
	{
		if(courses.get(course)<10)
		{
			int numOfStudents = courses.get(course);
        	courses.put(course,numOfStudents+1);
			System.out.println("You are successfully enrolled to this course....");
		}
		else
		{
			System.out.println("You can't enroll to this course....");
		}
	}
	public void viewGradeCard()
	{
		System.out.println("Currently no grade cards are available");
	}
}
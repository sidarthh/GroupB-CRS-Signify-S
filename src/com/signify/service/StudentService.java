/**
 * 
 */
package com.signify.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.signify.bean.Student;
import com.signify.bean.User;

/**
 * @author Naman
 *
 */
public class StudentService implements StudentInterface {

	List<Student>s1 = new ArrayList<Student>();
	public Map<String,Integer>courses = new HashMap<String,Integer>();
	Student obj1 = new Student();
	Student obj2 = new Student();
	Student obj3 = new Student();
	public StudentService()
	{
		obj1.setStudentId(11);
		obj1.setBranch("Computer Engineering");
		obj1.setName("Abhay");
		obj1.setRole("student");
		obj1.setBatch(101);
		obj2.setStudentId(12);
		obj2.setBranch("Mechanical Engineering");
		obj2.setName("Akhil");
		obj2.setRole("student");
		obj2.setBatch(102);
		obj3.setStudentId(13);
		obj3.setBranch("Electrical Engineering");
		obj3.setName("Rahul");
		obj3.setRole("student");
		obj3.setBatch(103);
		s1.add(obj1);
		s1.add(obj2);
		s1.add(obj3);
		courses.put("OPERATING SYSTEM",5);
		courses.put("DATABASE MANAGEMENT SYSTEM",1);
		courses.put("COMPUTER NETWORKS",2);
		courses.put("DATA STRUCTURE AND ALGORITHMS",10);
		courses.put("SOFTWARE ENGINEERING",7);
	}
	public void myInfo(int id)
	{
		Boolean flag = true;
		for(Student s: s1)
		{
			if(s.getStudentId()==id)
			{
				flag = false;
				System.out.println("STUDENT INFO---");
				System.out.println("STUDENT ID : "+s.getStudentId());
				System.out.println("STUDENT NAME : "+s.getName());
				System.out.println("STUDENT BRANCH : "+s.getBranch());
				System.out.println("STUDENT BATCH : "+s.getBatch());
			}
		}
		if(flag)
		{ 
		   System.out.println("No such student exist...");	 
		}
	}
	public void viewCourses() 
	{
		Iterator<String> it = courses.keySet().iterator();       //keyset is a method  
        int count = 1;
		while(it.hasNext())  
        {  
            String key = (String)it.next(); 
//            System.out.println("Roll no.: "+key+"     name: "+hm.get(key));  
            System.out.println(count+"."+key+":"+courses.get(key));
            count++;
        } 	
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
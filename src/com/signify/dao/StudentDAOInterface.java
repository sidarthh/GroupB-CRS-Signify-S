package com.signify.dao;

import com.signify.bean.Student;

public interface StudentDAOInterface {

//	public boolean registerDAOStudent(Student student);
	 public void registerDAOStudent(String name,String password,String branch,int batch);
	 public void viewDAOCourses();
	 public void viewDAOInfo(int id);
}

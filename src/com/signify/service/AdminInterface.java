package com.signify.service;

import com.signify.bean.*;

public interface AdminInterface {

	public void addProfessor(Professor prof);
	public void assignCourse();
	public void approveStudent();
	public void addAdmin();
	public void viewInfo(int id,int val);
	public void editUser(int id,int val);
}

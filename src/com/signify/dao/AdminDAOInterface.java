package com.signify.dao;

import com.signify.bean.Professor;

public interface AdminDAOInterface {
	
	public void addDAOProfessor(Professor prof);
	public void viewDAOInfo(int id);
	public void editDAOInfo(int id,int parameter);
}

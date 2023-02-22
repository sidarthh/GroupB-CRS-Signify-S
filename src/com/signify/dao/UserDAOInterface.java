package com.signify.dao;

public interface UserDAOInterface {

	public boolean validate(int userID,String password,String role);
	public void updateDAOPassword(int id,String oldpass,String newpass);
}

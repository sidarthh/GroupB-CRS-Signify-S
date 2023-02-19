/**
 * 
 */
package com.signify.service;

/**
 * @author asus
 *
 */
public interface UserInterface {

	public void userLogin(String role);
	public void registerForUser(String name,String role,String password);
	public void deleteUser(int id);
	public void updateUser1(int id,String newName);
	public void updateUser2(int id,String newRole);
	public void updateUser3(int id,String newPassword);
	public void viewUser(int id);
	public void viewListUser();
}

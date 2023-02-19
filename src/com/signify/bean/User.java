/**
 * 
 */
package com.signify.bean;

/**
 * @author Naman
 *
 */
public class User {
	
	private int userId;
	private String name;
	private String role;
	private String password;
	
	public String toString() {
		String str = "Name: " + this.name + " Role: " + this.role;
		return str;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
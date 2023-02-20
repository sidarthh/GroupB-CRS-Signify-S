package com.signify.service;

import java.util.HashMap;
import java.util.Map;

public interface StudentInterface {

	public Map<String,Integer>courses = new HashMap<String,Integer>();
	public void viewCourses();
	public void register(String res);
	public void payFee(String mode);
	public void myInfo(int id);
	public void viewGradeCard();
}

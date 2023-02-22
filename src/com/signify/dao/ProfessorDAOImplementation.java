/**
 * 
 */
package com.signify.dao;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
/**
 * @author SIDARTH SAIKUMAR
 *
 */
public class ProfessorDAOImplementation implements ProfessorDAOInterface {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/src";
	Connection conn = null;
	PreparedStatement stmt = null;
	PreparedStatement stmt2 = null;
	PreparedStatement stmt3 = null;
	Scanner input = new Scanner(System.in);

	   //  Database credentials
	 static final String USER = "root";
	 static final String PASS = "Passw0rd-1";

	@Override
	public void addgrades(int student_id) {
		try{
			   
			    
			   
			      System.out.println("Connecting to database...");
			      conn = DriverManager.getConnection(DB_URL,USER,PASS);
			   
			      String sql = "SELECT * FROM student where studentid="+student_id+"";
			      String sql3 = "SELECT feepaid from registeredcourse where studentid="+student_id+"";
			      //stmt3 = conn.prepareStatement(sql3);
			      //ResultSet rsss = stmt3.executeQuery(sql3);
			      
			      stmt = conn.prepareStatement(sql);
			      ResultSet rs = stmt.executeQuery(sql);
			      /*while(rs.next()) {
			    	  System.out.println(rsss.getBoolean("feepaid"));
			      }*/
			      
			      
		    	  while(rs.next()) {
			    	  System.out.println("Student ID:"+rs.getInt("studentid"));
			    	  System.out.println("Student name:"+rs.getString("studentname"));
			    	  System.out.println("Student Branch:"+rs.getString("studentbranch"));
			    	  System.out.println("Student Batch:"+rs.getInt("studentbatch"));
			      }
			      System.out.println("Enter  O or A or B or C or F grade for student");
			      String grade = input.next();
			     
			      String sql2 = "UPDATE grade set grade='"+grade+"' where studid="+student_id+" ";
			      stmt2 = conn.prepareStatement(sql2);
			      stmt2.executeUpdate(sql2);
			      System.out.println("Grade Successfully added");
			    	  
			      
			      
			      
			      
			      
			      
			      
			      

			      
			      stmt.close();
			      conn.close();
			   }catch(SQLException se){
			      //Handle errors for JDBC
				   System.out.println("SQLException"+ se.getErrorCode()+"-->"+se.getCause());
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
				   System.out.println("Exception"+e.getLocalizedMessage());
			      e.printStackTrace();
			   }finally{
			      //finally block used to close resources
			      try{
			         if(stmt!=null)
			            stmt.close();
			      }catch(SQLException se2){
			      }// nothing we can do
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }//end finally try
			   }
		
		
		
	}

	@Override
	public void viewEnrolledStudents(int id) {
		try{
			   
		    
			   
		      System.out.println("Connecting to database...");
		      conn = DriverManager.getConnection(DB_URL,USER,PASS);
		      String sql = "Select courseid from courses where Professorid="+id+"";
		      stmt = conn.prepareStatement(sql);
		      ResultSet rs = stmt.executeQuery(sql);
		      if(!rs.next()) {
		    	  System.out.println("No courses assigned to you yet!");
		      }
		      int course_id = rs.getInt("courseid");
		      System.out.println("Course ID is:"+course_id);
		      String sql2 = "SELECT s.studentid,s.studentname FROM registeredcourse as r,student as s WHERE r.studentid = s.studentid AND r.courseCode="+course_id+"";
		      stmt2 = conn.prepareStatement(sql2);
		      ResultSet rss = stmt2.executeQuery(sql2);
		      //System.out.println("Hi");
		      //System.out.println(rss);
		      System.out.println("----------------------------------");
	    	  while(rss.next()) {
	    		  
	    		  System.out.println("Student ID:"+rss.getInt("studentid"));
	    		  System.out.println("Student Name:"+rss.getString("studentname"));
	    	  }
	    	  System.out.println("------------------------------------");
		      
		      
		      
		      
		      
		      
		      
		      

		      
		      stmt.close();
		      conn.close();
		   }catch(SQLException se){
		      //Handle errors for JDBC
			   System.out.println("SQLException"+ se.getErrorCode()+"-->"+se.getCause());
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
			   System.out.println("Exception"+e.getLocalizedMessage());
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException se2){
		      }// nothing we can do
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }
		
		
		
	}

}

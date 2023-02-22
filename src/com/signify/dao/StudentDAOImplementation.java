package com.signify.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.signify.service.StudentInterface;




public class StudentDAOImplementation implements StudentDAOInterface{
	
	

	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	 static final String DB_URL = "jdbc:mysql://localhost/src";

	   //  Database credentials
	 static final String USER = "root";
	 static final String PASS = "Passw0rd-1";
	 static int countUserID = 1;
	 static int countStudentID = 101;
	 Connection conn = null;
	 PreparedStatement stmt = null;
	 PreparedStatement stmt2 = null;
	 PreparedStatement stmt3 = null;
	 public void registerDAOStudent(String name,String password,String branch,int batch)
	 {
		   
		   try{
			   
			   // Step 3 Register Driver here and create connection 
			   
			   //Class.forName("com.mysql.cj.jdbc.Driver");

			   // Step 4 make/open  a connection 
			   
			      System.out.println("Connecting to database...");
			      conn = DriverManager.getConnection(DB_URL,USER,PASS);
			   
			      //STEP 4: Execute a query
			      
			      String sql="insert into user(name,password,roleid) values(?,?,?)";
			      
			      
			      stmt = conn.prepareStatement(sql);
			      stmt.setString(1,name);
			      stmt.setString(2,password);
			      stmt.setInt(3,2);
			      
			      stmt.executeUpdate();
			      stmt.close();
			      //Fetch user id 
			      String sql2="select id from src.user where name='"+name+"' and password='"+password+"'";
			      
			 
			      stmt2 = conn.prepareStatement(sql2);
			      ResultSet rs = stmt2.executeQuery(sql2);
			      int studid = 0;

			      //STEP 5: Extract data from result set
			      while(rs.next()){
			         //Retrieve id
			    	 studid = rs.getInt("id");
			         
			      }
			      
			      String sql3="insert into student values(?,?,?,?,?)";			      
			      stmt3 = conn.prepareStatement(sql3);
			      stmt3.setInt(1,studid);
			      stmt3.setString(2,name);
			      stmt3.setString(3,branch);
			      stmt3.setInt(4,batch);
			      stmt3.setInt(5,0);
			      stmt3.executeUpdate();
			      //STEP 6: Clean-up environment
			     // rs.close();
		
			      conn.close();
			      System.out.println("Student is registered successfully.....");
			      System.out.println("Your user id is : "+studid);
			      System.out.println("Pending Approval, Contact Admin");
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
			   }//end try
			   System.out.println("");
           //end main
      }
	 public void viewDAOCourses()
	 {
		    
		  
		   try{
			   
			   // Step 3 Register Driver here and create connection 
			   
			   //Class.forName("com.mysql.cj.jdbc.Driver");

			   // Step 4 make/open  a connection 
			   
			      System.out.println("Connecting to database...");
			      conn = DriverManager.getConnection(DB_URL,USER,PASS);
			   
			   
			 
			   // Let us update age of the record with ID = 102;
			      //int rows = stmt.executeUpdate();
			      //System.out.println("Rows impacted : " + rows );

			      // Let us select all the records and display them.
			      String sql = "SELECT courseid, coursename , studentcount FROM courses";
			      stmt = conn.prepareStatement(sql);
			      ResultSet rs = stmt.executeQuery(sql);

			      //STEP 5: Extract data from result set
			      System.out.println("AVAILABLE COURSES");
			      System.out.println("-----------------");
			      while(rs.next()){
			         //Retrieve by column name
			         int userid  = rs.getInt("courseid");
			         String studentname = rs.getString("coursename");
			         int studentcount = rs.getInt("studentcount");
			         //Display values
			         System.out.print("COURSE ID : " + userid);
			         System.out.print(" | COURSE NAME : " + studentname);
			         System.out.print(" | STUDENT COUNT : " + studentcount);
			         System.out.println();
			         
			      }
			      //STEP 6: Clean-up environment
			     // rs.close();
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
			   }//end try
			   System.out.println();
         //end main
	 }
	 public void viewDAOInfo(int id)
	 {
		 try{
			   
			   // Step 3 Register Driver here and create connection 
			   
			   //Class.forName("com.mysql.cj.jdbc.Driver");

			   // Step 4 make/open  a connection 
			   
			      System.out.println("Connecting to database...");
			      conn = DriverManager.getConnection(DB_URL,USER,PASS);
			   
			   
			 
			   // Let us update age of the record with ID = 102;
			      //int rows = stmt.executeUpdate();
			      //System.out.println("Rows impacted : " + rows );

			      // Let us select all the records and display them.
			      String sql = "SELECT * FROM student where studentid="+id;
			      stmt = conn.prepareStatement(sql);
			      ResultSet rs = stmt.executeQuery(sql);

			      //STEP 5: Extract data from result set
			      System.out.println("STUDENT INFO");
			      System.out.println("------------");
			      while(rs.next()){
			         //Retrieve by column name
			         int userid  = rs.getInt("studentid");
			         String studentname = rs.getString("studentname");
			         String studentbranch = rs.getString("studentbranch");
			         int studentbatch = rs.getInt("studentbatch");
			         int studentid = rs.getInt("studentid");
			         //Display values
			         System.out.println("STUDENT ID : " + userid);
			         System.out.println("STUDENT NAME : " + studentname);
			         System.out.println("STUDENT BRANCH : " + studentbranch);
			         System.out.println("STUDENT BATCH : " + studentbatch);
			         System.out.println();
			         
			      }
			      //STEP 6: Clean-up environment
			     // rs.close();
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
			   }//end try
			   System.out.println();
       //end main
	 }
}


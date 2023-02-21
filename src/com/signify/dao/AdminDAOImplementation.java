package com.signify.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.signify.bean.Professor;

public class AdminDAOImplementation implements AdminDAOInterface{
 
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/src";

	   //  Database credentials
	 static final String USER = "root";
	 static final String PASS = "shinamangarg2001";
	 Connection conn = null;
	 PreparedStatement stmt = null;
	 PreparedStatement stmt2 = null;
	 PreparedStatement stmt3 = null;
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
			      String sql = "SELECT * FROM user where id="+id;
			      stmt = conn.prepareStatement(sql);
			      ResultSet rs = stmt.executeQuery(sql);

			      //STEP 5: Extract data from result set
			      System.out.println("USER INFO");
			      System.out.println("------------");
			      while(rs.next()){
			         //Retrieve by column name
			         int userid  = rs.getInt("id");
			         String name = rs.getString("name");
			         int roleid = rs.getInt("roleid");
			         //Display values
			         System.out.println("USER ID : " + userid);
			         System.out.println("NAME : " + name);
			         System.out.println("ROLE ID : " + roleid);
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
	public void editDAOInfo(int id,int parameter)  // 1.name   2.password  3.role
	{
		
	}
	public void addDAOProfessor(Professor prof)
	{
		
	}
}

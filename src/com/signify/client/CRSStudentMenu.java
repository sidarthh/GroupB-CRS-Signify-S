/**
 * 
 */
package com.signify.client;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


import com.signify.service.StudentInterface;
import com.signify.service.StudentService;
import com.signify.service.UserService;

/**
 * @author Naman
 *
 */
public class CRSStudentMenu {

	
	static public void displayMenu() {
		 System.out.println("WELCOME TO STUDENT MENU");
		 System.out.println("==========================");
		 System.out.println();
		 System.out.println("1.REGISTER FOR COURSES");
		 System.out.println("2.PAY FEE");
		 System.out.println("3.MY INFO");
		 System.out.println("4.VIEW GRADE CARD");
		 System.out.println("5.EXIT");
		 boolean ex = false;
		 Scanner sc = new Scanner(System.in);
		 StudentInterface student = new StudentService();
		 while(!ex)
		 {
			 System.out.println();
			 System.out.println("Enter your choice : ");
			 int choice = sc.nextInt();
			 try
			 {
				 
				 switch(choice)
				 {
				   case 1:  System.out.println("Select the course you want to register : ");
				            String enter_ch = sc.nextLine();
				            System.out.println();
				            student.viewCourses();
//				            int count = 1;
//				            Iterator<String> it = student.courses.keySet().iterator();       //keyset is a method  
//				            while(it.hasNext())  
//				            {  
//					            String key = (String)it.next();  
////					            System.out.println("Roll no.: "+key+"     name: "+hm.get(key));  
//					            System.out.println(count+"."+key+":"+student.courses.get(key));
//				            }  
				            String course = sc.nextLine();
				            course = course.toUpperCase();
				            student.register(course);
				            break;
				   case 2:  System.out.println("Do you want to pay online or offline");
					        System.out.println("Enter your choice : ");
					        String mode = sc.next();
					        student.payFee(mode);
				            break;
				            
				   case 3:  System.out.println("Enter your ID:");
				            int idNumber = sc.nextInt();
					        student.myInfo(idNumber);
					        break;
				   case 4:  student.viewGradeCard();
				            break;
				   case 5:  System.out.println();
					        System.out.println("THANK YOU FOR VISITING STUDENT MENU");
					        System.out.println();
					        ex = true;
					        CRSApplicationMenu obj = new CRSApplicationMenu();
					        obj.displayApplicationMenu();
				   default: System.out.println("Invalid selection");	        
				 }
			 }
			 catch(Exception e)
			 {
				 System.out.println("Exception occurred");
			 }
			 finally
			 {
				 ex = false;  
			 }
		 }
	}
	
}

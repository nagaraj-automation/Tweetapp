package com.tweetit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;


public class Register {
	void register()
	{
	Scanner sc= new Scanner(System.in);
	String fname,email,un,pw,contact;

	System.out.println("Enter Fullname");
	fname=sc.nextLine();  
	System.out.println("Enter Email");
	email=sc.nextLine(); 
	System.out.println("Enter Contact");
	contact=sc.nextLine(); 
	System.out.println("Enter Username");
	un=sc.nextLine(); 
	System.out.println("Enter Password");
	
	pw=sc.nextLine(); 

	 

	 try{  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/tweet","root","pass@word1");  

	Statement stmt=con.createStatement();  
	String sql="insert into register values('" + fname + "','" + email + "','" + contact + "','" + un + "','" + pw + "')";
	stmt.executeUpdate(sql);


	    
	      System.out.println("Record saved successfully");
	      
	      System.out.println("***************************************************");
	      System.out.println("Login in to post  and see the other posts ");
	      System.out.println("***************************************************");
	      Login x1=new Login();
	        x1.login();
	con.close();  

	
	}catch(Exception e){ System.out.println(e);}  


	}
}

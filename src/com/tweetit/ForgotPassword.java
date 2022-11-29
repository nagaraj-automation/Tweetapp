package com.tweetit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class ForgotPassword {
	void forgot()
	{
	Scanner sc1= new Scanner(System.in);
	String pw1,PASSWORD;
	System.out.println("Enter old Password");
	PASSWORD=sc1.nextLine();  
	System.out.println("Enter New Password");
	pw1=sc1.nextLine(); 

	 try{  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/tweet","root","pass@word1");  

	Statement stmt=con.createStatement();  
	String sql="update register set PASSWORD='" + pw1 + "' where PASSWORD='" + PASSWORD + "'";
	stmt.executeUpdate(sql);


	    
	      System.out.println("Password Changed successfully");
	con.close();  
	}catch(Exception e){ System.out.println(e);}  

	}

}

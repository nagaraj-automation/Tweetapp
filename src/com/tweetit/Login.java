package com.tweetit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Login {
	void login()
	{
	Scanner sc= new Scanner(System.in);
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/tweet","root","pass@word1");  

	String un1="-",pw1="-",un,pw;
	System.out.println("Enter Username");
	un=sc.nextLine(); 
	System.out.println("Enter Password");
	pw=sc.nextLine(); 
	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from register");  
	while(rs.next())  
	{
	un1=rs.getString(4);
	pw1=rs.getString(5);  
	}

	if ((un.equals(un1)) && (pw.equals(pw1)))
	{
	System.out.println("Login Successfull");

	System.out.println("*************************");
	System.out.println("Menu");
	System.out.println("*************************");
	System.out.println("1. Post Tweet");
	System.out.println("2. View My Tweets");
	System.out.println("3. View All Users");
	System.out.println("4. View All Tweets");
	System.out.println("5. Reset Password");
	System.out.println("6. Logout");
	
	String choice1="-";
	Scanner sc1= new Scanner(System.in);
	System.out.println("Enter your Choice :");
	choice1=sc1.nextLine(); 
	System.out.println(choice1);
	if (choice1.equals("1"))
	{

	String fname,
	//tdate,
	ttime,post;
	System.out.println("Enter Fullname");
	fname=sc1.nextLine();  
	String tdate=LocalDate.now().toString();
	//System.out.println("Enter Date");
	//tdate=sc1.nextLine(); 
	//System.out.println("Enter Time");
	
	ttime=LocalTime.now().toString(); 
	System.out.println("Enter Post");
	post=sc1.nextLine(); 



	String sql="insert into tweetpost values('" + fname + "','" + tdate + "','" + ttime + "','" + post + "')";
	stmt.executeUpdate(sql);


	    
	      System.out.println("Tweet  Posted successfully");
	con.close();  

	}





	if (choice1.equals("2"))
	{

	String fname,tdate,ttime,post;

	String fn="Nagaraj Hiremath";

	ResultSet rs1=stmt.executeQuery("select * from tweetpost where FULL_NAME='" + fn + "'");  
	System.out.println("*************************");
	System.out.println("My Tweets");
	System.out.println("*************************");
	while(rs1.next())  
	System.out.println(rs1.getString(1)+"  "+rs1.getString(2)+"  "+rs1.getString(3)+"  "+rs1.getString(4));  
	con.close();  

	}

	if (choice1.equals("3"))
	{

	String fname,tdate,ttime,post;



	ResultSet rs2=stmt.executeQuery("select * from register");  
	System.out.println("******************************************************************");
	System.out.println("All User List");
	System.out.println("*******************************************************************");
	System.out.println("UserName                     Email                        Contact");
	System.out.println("*******************************************************************");
	while(rs2.next())  
	System.out.println(rs2.getString(1)+"                   "+rs2.getString(2)+"            "+rs2.getString(3));  
	con.close();  

	}

	if (choice1.equals("4"))
	{

	String fname,tdate,ttime,post;



	ResultSet rs22=stmt.executeQuery("select * from tweetpost");  
	System.out.println("*************************************************************************");
	System.out.println("                           All Tweets                                  ");
	System.out.println("*************************************************************************");
	System.out.println("UserName                 Date             Time               TweetPost");
	System.out.println("**************************************************************************");
	while(rs22.next())  
	System.out.println(rs22.getString(1)+"               "+rs22.getString(2)+"              "+rs22.getString(3)+"            "+rs22.getString(4));  
	con.close();  

	}
	
	if (choice1.equals("6")) {
		System.out.println("You logged out successfully!"); 
	}


	}else {
		System.out.println("User doesnt exit! Register to Login");
		System.out.println("*************************");
		System.out.println("Enter the correct username and password");
		//login();
		Login x1=new Login();
        x1.login();
		
	}




	}catch(Exception e){ System.out.println(e);}  








	}
}

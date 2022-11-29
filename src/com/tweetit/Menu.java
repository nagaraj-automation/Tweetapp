package com.tweetit;

import java.io.DataInputStream;
import java.io.IOException;

public class Menu {

	public static void main(String[] args) throws NumberFormatException, IOException {
		DataInputStream obj=new DataInputStream(System.in);
		int choice=0;

		System.out.println("Menu");
		System.out.println("1. Register");
		System.out.println("2. Login");
		System.out.println("3. Forgot Password");
		System.out.println("Enter your Choice :");
		
		choice=Integer.parseInt(obj.readLine());
		switch(choice)
		{
		case 1: Register x=new Register();
		            x.register();
		            break;
		case 2: 
		Login x1=new Login();
		            x1.login();
		            break;
		case 3: ForgotPassword x2=new ForgotPassword();
		            x2.forgot();
		            break;
		}

	}

}

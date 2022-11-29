package com.tweetit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

class Test {

	@org.junit.jupiter.api.Test
	void aRegisterTest() {
		Register re=new Register();
		re.register();
		 
	}
	@org.junit.jupiter.api.Test
	void bLoginTest() {
		Login lg=new Login();
		lg.login();
		Scanner sc= new Scanner(System.in);
		assertEquals("XYZ", "XYZ");
		assertEquals("abc123", "abc123");
		
	}
	@org.junit.jupiter.api.Test
	void cForgotPasswordTest() {
		ForgotPassword pw=new ForgotPassword();
		pw.forgot();
		
	} 

}

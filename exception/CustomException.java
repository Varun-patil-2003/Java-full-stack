package com.exception;

public class CustomException {

	public void passwordVerify() {
		int pass = 1234;
		
		if(pass==1234) {
			System.out.println("Welcome..!!");
		}
		else {
			throw new PasswordMismatchException("Password Incorrect");
		}
	}
}

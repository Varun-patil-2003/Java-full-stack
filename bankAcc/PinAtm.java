package com.bankAcc;

import java.util.*;
public class PinAtm {

	Scanner s = new Scanner(System.in);
	public void pinVerify() {
		int pin = 123456;
		System.out.println("Enter Pin : ");
		int b = s.nextInt()	;
		if(b == pin) {
			System.out.println("Welcome..!");
		}
		else {
			throw new NotVerifiedPinException("Entered Invalid Pin");
		}
	}
}

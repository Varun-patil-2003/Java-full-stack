package com.methods;

import java.util.*;
public class Employee1 {
	int id;
	String name,address;
	String designation;
	void info()
	{
		System.out.println("ID = "+id);
		System.out.println("Name = "+name);
		System.out.println("Address = "+address);
		System.out.println("Designation = "+designation);
		System.out.println();
	}
	public static void main(String args[]) {
		Scanner S = new Scanner(System.in);
		
		Employee E1 = new Employee();
		E1.id = 101;
		E1.name = "Sidheshwar Jadhav";
		E1.address = "Jalna";
		System.out.println("Enter Designation : ");
		E1.designation = S.next();
		E1.info();
		Employee E2 = new Employee();
		E2.id = 102;
		E2.name = "Sham Patil";
		E2.address = "Kannad";
		System.out.println("Enter Designation : ");
		E2.designation = S.next();
		E2.info();
		Employee E3 = new Employee();
		E3.id = 103;
		E3.name = "Gaurav Patil";
		E3.address = "Sillod";
		System.out.println("Enter Designation : ");
		E3.designation = S.next();
		E3.info();
		Employee E4 = new Employee();
		E4.id = 104;
		E4.name = "Kaushal Kathar";
		E4.address = "Chincholi";
		System.out.println("Enter Designation : ");
		E4.designation = S.next();
		E4.info();
		Employee E5 = new Employee();
		E5.id = 105;
		E5.name = "Varun Patil";
		E5.address = "Soegaon";
		System.out.println("Enter Designation : ");
		E5.designation = S.next();
		E5.info();
		
		S.close();
	}
}

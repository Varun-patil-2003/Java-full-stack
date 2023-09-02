package com.methods;

import java.util.*;
public class Employee {
	int id;
	String name,address,designation;
	void info()
	{
		System.out.println("ID = "+id);
		System.out.println("Name = "+name);
		System.out.println("Address = "+address);
		System.out.println("Designation = "+designation);
		System.out.println();
	}
	
	public static void main(String args[]){
		Employee E1 = new Employee();
		E1.id = 101;
		E1.name = "Sidheshwar Jadhav";
		E1.address = "Jalna";
		E1.designation = "Tester";
		E1.info();
		Employee E2 = new Employee();
		E2.id = 102;
		E2.name = "Sham Patil";
		E2.address = "Kannad";
		E2.designation = "Developer";
		E2.info();
		Employee E3 = new Employee();
		E3.id = 103;
		E3.name = "Gaurav Patil";
		E3.address = "Sillod";
		E3.designation = "Operator";
		E3.info();
		Employee E4 = new Employee();
		E4.id = 104;
		E4.name = "Kaushal Kathar";
		E4.address = "Chincholi";
		E4.designation = "Developer";
		E4.info();
		Employee E5 = new Employee();
		E5.id = 105;
		E5.name = "Varun Patil";
		E5.address = "Soegaon";
		E5.designation = "Manager";
		E5.info();
		Employee E6 = new Employee();
		E6.id = 106;
		E6.name = "Dhananjay Kathar";
		E6.address = "Kaldari";
		E6.designation = "CEO";
		E6.info();
	}
}

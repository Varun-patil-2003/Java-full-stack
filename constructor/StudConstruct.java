package com.constructor;

public class StudConstruct {

	int roll;
	String name;
	double marks;
	long contact;
	
	void StdDetails()
	{
		System.out.println("Roll No = "+roll+"\nName = "+name+"\nMarks = "+marks+"\nContact = "+contact+"\n");
	}
	
	public StudConstruct(int roll,String name,double marks,long contact)
	{
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.contact = contact;
	}
	public StudConstruct(int Roll,String Name,double Marks) {
		// TODO Auto-generated constructor stub
		roll = Roll;
		name = Name;
		marks = Marks;
		}
	
	public static void main(String[] args) {
		StudConstruct S = new StudConstruct(102, "Varun", 79.71,943770035);
		S.StdDetails();
		StudConstruct S1 = new StudConstruct(32, "Gaurav", 80.0,932266758);
		S1.StdDetails();
		StudConstruct S2 = new StudConstruct(101, "Sham", 84.40);
		S2.StdDetails();
	}
}

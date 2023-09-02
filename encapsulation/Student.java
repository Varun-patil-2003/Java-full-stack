package com.encapsulation;

public class Student {

	private int roll;
	private String name;
	private long contact;
	private double marks;
	
	public int getRoll() {
		return roll;
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}
	
	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public String toString() {
		return "Student [Roll = "+roll+", Name = "+name+", Contact = "+contact+", Marks = "+marks+"]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student();
		s.setRoll(102);
		s.setName("Varun");
		s.setContact(9322669924l);
		s.setMarks(79.71);
		
		System.out.println(s.toString());
		
		Student pradip = new Student();
		pradip.setRoll(104);
		pradip.setName("Pradip");;
		pradip.setContact(9860101010l);
		pradip.setMarks(99.98);
		
		System.out.println(pradip.toString());
	}

}

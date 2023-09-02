package com.encapsulation;

public class EncapsulationExample {

	private int id ;
	private String name,address;
	private long contact;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	void display() {
		System.out.println("Id = "+id+"\nName = "+name+"\nContact = "+contact+"\nAddress = "+address);
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
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public static void main(String args[]) {
		
		EncapsulationExample e = new EncapsulationExample();
		e.setId(102);
		e.setName("Varun");
		e.setContact(9322669924l);
		e.setAddress("Chh. Sambhajinagar");
		/* 
		 * e.getId();
		 * e.getName();
		 * e.getContact();
		 * e.getAddress();
		*/
		e.display();;
	}
}

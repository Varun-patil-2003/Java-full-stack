package com.encapsulation;

public class Employee {

	private int id;
	private String name;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee(102, "Varun", 180000);
		System.out.println(e.toString());
		
		Employee e2 = new Employee(104, "Pradip", 200000);
		System.out.println(e2.toString());
		
		Employee e3 = new Employee(32, "Prasanna", 1000000);
		System.out.println(e3.toString());
		
		Employee e4 = new Employee(50, "Siddheshwar", 1929873);
		System.out.println(e4.toString());
		
		Employee e5 = new Employee(101, "Shyamsundar", 7802340);
		System.out.println(e5.toString());
	}

}

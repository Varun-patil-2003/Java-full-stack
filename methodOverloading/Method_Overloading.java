package com.methodOverloading;

public class Method_Overloading {

	int add(int a,int b)
	{
		return a+b;
	}
	
	double add(double a,double b)
	{
		return a+b;
	}
	
	char add(char a,char b)
	{
		return (char)(a+b);
	}
	
	String add(String a,String b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method_Overloading m = new Method_Overloading();
		System.out.println(m.add(5, 10));
		System.out.println(m.add(3.4, 6.6));
		System.out.println(m.add("Varun", "Patil"));
		char j=m.add('V', 'p');
		System.out.println(j);
		System.out.println((int)j);
	}

}

package com.encapsulation;

public class Print {

	int x = 1;
	void print()
	{
		int count = x++;
		System.out.println(count);
		if (x<=100)
		{
			print();
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Print p = new Print();
		p.print();
	}

}

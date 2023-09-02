package com.encapsulation;

public class P1print {

	public int a = 1;
	void num()
	{
		
		if(a<100)
		{
			if (a>50 & a<=60)
			{
				
			}
			else
			{
				System.out.println(a);
			}
			a++;
			num();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P1print p = new P1print();
		p.num();
	}

}

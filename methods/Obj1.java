package com.methods;

public class Obj1 {
		int a = 10,b = 5;
		void add()
		{
			System.out.println("Addition is = "+(a+b));
		}
		void sub()
		{
			System.out.println("Substraction is = "+(a-b));
		}
        void mul()
        {
            System.out.println("Multiplication is = "+(a*b));
        }
        void div()
        {
            System.out.println("Division is = "+(a/b));
        }
        void mod()
        {
            System.out.println("Modulus is = "+(a%b));
        }
        
        public static void main(String args[])
        {
        	Obj1 o1 = new Obj1();
        	Obj1 o2 = new Obj1();
        	Obj1 o3 = new Obj1();
        	Obj1 o4 = new Obj1();
        	Obj1 o5 = new Obj1();
        	o1.add();
        	o2.sub();
        	o3.mul();
        	o4.div();
        	o5.mod();
        }
}
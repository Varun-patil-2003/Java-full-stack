package com.constructor;

public class DefConstruct {
	public DefConstruct()
	{
		System.out.println("Constructor Called .");
	}
	public void DefConstruct()
	{
		System.out.println("Method Called .");
	}
	public static void main(String args[])
	{
		new DefConstruct();						//constructor calling/object making
		DefConstruct D = new DefConstruct();	//uniquely identified because of D object
	}
}
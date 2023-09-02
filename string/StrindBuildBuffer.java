package com.string;

public class StrindBuildBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long startTime = System.currentTimeMillis();
		StringBuffer s = new StringBuffer(999999999);
		for(int i=0;i<9999999;i++)
		{
			s.append("Programming");
		}
		System.out.println(System.currentTimeMillis()-startTime+" ms");
	}
}

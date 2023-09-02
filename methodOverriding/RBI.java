package com.methodOverriding;

public class RBI extends ICICI_BANK {

	public static void main(String ars[])
	{
		ICICI_BANK i = new RBI();
		i.roi();
		
		AXIS_BANK A = new AXIS_BANK();
		A.roi();
		
		KOTAK_MAHINDRA_BANK K = new KOTAK_MAHINDRA_BANK();
		K.roi();
		
		KARNATAKA_BANK k = new KARNATAKA_BANK();
		k.roi();
		
	}
}

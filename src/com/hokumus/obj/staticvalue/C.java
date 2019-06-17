package com.hokumus.obj.staticvalue;

public class C extends B {
	static {
		System.out.println("3");
		sayi=7;
		System.out.println(sayi);		
	}
	
	public C() {
		super();
		System.out.println(sayi);
		System.out.println(sayi1);
		System.out.println("6");
	}

}

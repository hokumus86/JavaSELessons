package com.hokumus.obj.staticvalue;

public class A {
	static {
		System.out.println("1");		
	}	
	public A() {
		System.out.println(sayi);
		System.out.println(sayi1);
		System.out.println("4");
	}	
	public A(int a) {	
		this();
		System.out.println("7");
	}	
	public static int sayi=-1;
	public int sayi1=0;

}

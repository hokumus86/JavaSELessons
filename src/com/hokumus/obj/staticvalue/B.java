package com.hokumus.obj.staticvalue;

public class B extends A {
	static {
		System.out.println("2");
		sayi=15;
		System.out.println(sayi);
	}	
	public B() {
		this(3);
		System.out.println(sayi);
		System.out.println(sayi1);
		System.out.println("5");
	}
	public B(int a) {	
		super(5);
		System.out.println("8");
	}

}

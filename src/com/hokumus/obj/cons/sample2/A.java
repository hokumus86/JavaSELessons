package com.hokumus.obj.cons.sample2;

public class A {
	
	public A() {
		this(2);
		System.out.println("1");
		
	}

	public A(int sayi) {
		this("Hüseyin");
		System.out.println("2");
	}
	
	public A(String isim) {
		System.out.println("3");
		
	}
}

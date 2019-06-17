package com.hokumus.obj.cons.sample2;

public class C extends B{
	
	int sayi =0;
	public C() {
		super();
		System.out.println("7");
	}

	public C(int sayi) {
		this();
		System.out.println("8");
	}
	
	public C(String isim) {
		this(3);
		System.out.println("9");
	}

}

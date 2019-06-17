package com.hokumus.obj.cons.sample2;

public class B extends A{
	public B() {
		super(5);
		System.out.println("4");
	}

	public B(int sayi) {
		this();
		System.out.println("5");
	}
	
	public B(String isim) {
		super("okumuþ");
		System.out.println("6");
		
	}

}

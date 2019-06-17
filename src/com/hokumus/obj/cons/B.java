package com.hokumus.obj.cons;

public class B extends A {
	private int sayi;
	public B() {		
		System.out.println("3");
	}
	
	public B(int sayi) {
		super(2);
		this.sayi=sayi;
		System.out.println("4");
		
	}

}

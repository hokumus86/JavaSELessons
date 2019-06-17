package com.hokumus.obj.cons;

public class A {
	private int sayi = 0;
	private String isim = "5";

	public A() {
		System.out.println("1");
		// TODO Auto-generated constructor stub
	}

	public A(int sayi) {
		this.sayi = sayi;
		System.out.println("2");
		System.out.println(sayi);
	}

	public A(int sayi, String isim) {

		this.isim = isim;
		this.sayi = sayi;
		System.out.println("6");
	}

}

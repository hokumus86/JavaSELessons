package com.hokumu.obj.staticvalue;

public class Runner {
	
	public static void main(String[] args) {
		C temp = new C();
		temp.sayi1=12;
		B yeni = new B();
		yeni.sayi1=9;			
		System.out.println(A.sayi);
		System.out.println(temp.sayi);
		System.out.println(yeni.sayi);
		System.out.println(temp.sayi1);
		System.out.println(yeni.sayi1);
	}

}

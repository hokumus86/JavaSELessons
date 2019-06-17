package com.hokumus.obj.staticvalue;

public class Runer {
	 
	public static void main(String[] args) {
		A.sayi=10;
		A temp = new A();
		temp.sayi1=12;
		A yeni = new A();
		yeni.sayi1=9;
		
		System.out.println(A.sayi);
		System.out.println(temp.sayi);
		temp.sayi =11;
		System.out.println(A.sayi);
		System.out.println(temp.sayi);
		System.out.println(yeni.sayi);
		System.out.println(temp.sayi1);
		System.out.println(yeni.sayi1);
	}

}

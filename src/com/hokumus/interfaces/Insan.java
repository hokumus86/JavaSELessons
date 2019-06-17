package com.hokumus.interfaces;

public class Insan implements Calisabilir,IKontrol{

	@Override
	public void calis() {
		System.out.println("Insan çalýþýr");
		
	}

	
	public void dinlen() {
		System.out.println("Insan dinlenir");
		
	}


	@Override
	public void testEdebilir() {
		System.out.println("Insan Ürünleri test edebilir.");
		
	}


	@Override
	public void test() {
		System.out.println("Insan Ürünleri test ediyor.");
		
	}

}

package com.hokumus.interfaces;

public class Insan implements Calisabilir,IKontrol{

	@Override
	public void calis() {
		System.out.println("Insan �al���r");
		
	}

	
	public void dinlen() {
		System.out.println("Insan dinlenir");
		
	}


	@Override
	public void testEdebilir() {
		System.out.println("Insan �r�nleri test edebilir.");
		
	}


	@Override
	public void test() {
		System.out.println("Insan �r�nleri test ediyor.");
		
	}

}

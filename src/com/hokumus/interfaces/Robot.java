package com.hokumus.interfaces;

public class Robot implements Calisabilir,IKontrol {

	@Override
	public void calis() {
		System.out.println("Robot çalýþýr");
		
	}

	@Override
	public void testEdebilir() {
		System.out.println("Robot Ürünleri test edebilir.");
		
	}

	@Override
	public void test() {
		System.out.println("Robot Ürünleri test ediyor.");
		
	}

	

}

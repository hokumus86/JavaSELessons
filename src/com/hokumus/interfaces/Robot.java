package com.hokumus.interfaces;

public class Robot implements Calisabilir,IKontrol {

	@Override
	public void calis() {
		System.out.println("Robot �al���r");
		
	}

	@Override
	public void testEdebilir() {
		System.out.println("Robot �r�nleri test edebilir.");
		
	}

	@Override
	public void test() {
		System.out.println("Robot �r�nleri test ediyor.");
		
	}

	

}

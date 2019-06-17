package com.hokumus.inh.orn;

public class C extends A{
	
	public C() {
		super.test();
		test();
		super.deneme();
		
	}
	
	@Override
	public void test() {
		System.out.println("C Test Çalýþtý");
	}
	
	public void cDeneme() {
		System.out.println("C Deneme Çalýþtý");
	}
	
	public void atestCagir() {
		super.test();
	}
	

}

package com.hokumus.inh.orn;

public class B extends A{
	
	public B() {
		testeBasla();
		test();
	}
	
	@Override
	protected void deneme() {
		System.out.println("B Deneme Çalýþtý");
		deneme();
	}
	
	public void testeBasla() {
		System.out.println("B teste basla Çalýþtý");
	}

}

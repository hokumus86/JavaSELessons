package com.hokumus.inh.orn;

public class B extends A{
	
	public B() {
		testeBasla();
		test();
	}
	
	@Override
	protected void deneme() {
		System.out.println("B Deneme �al��t�");
		deneme();
	}
	
	public void testeBasla() {
		System.out.println("B teste basla �al��t�");
	}

}

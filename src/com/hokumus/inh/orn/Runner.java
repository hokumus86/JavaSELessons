package com.hokumus.inh.orn;

public class Runner {
	
	public static void main(String[] args) {
//		A[] a = new A[3];
//		a[0] = new B();
//		a[1] = new A();
//		a[2] = new C();
//		
//		C[] c = new C[3];
//		//c[0] =(C) new B();
//		c[1] = (C)new A();
//		c[2] = new C();
		B b1 = (B)new A();
		b1.testeBasla();
		C c1 = (C)new A();
		c1.deneme();
		c1.atestCagir();
		c1.test();
		c1.cDeneme();
		
		
		
		
//		for (A temp : a) {
//			temp.test();
//			temp.deneme();
//			
//		}
		
	}
	
	

}

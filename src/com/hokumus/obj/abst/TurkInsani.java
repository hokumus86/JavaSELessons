package com.hokumus.obj.abst;

public class TurkInsani extends AInsan {

	@Override
	public void calistir() {
		System.out.println("T�rk insan� �al��t�");
		
	}
	
	@Override
	public int toplama(int sayi1, int sayi2) {
		return sayi1+ sayi2+2;
	}

}

package com.hokumus.obj.abst;

public class Runner {
	
	public static void main(String[] args) {
		TurkInsani t = new TurkInsani();
		t.calistir();
		int sonuc =t.toplama(4, 4);
		System.out.println(" T�rk insan� toplam sonucu : "+sonuc);
		FinlandiyaInsani f = new FinlandiyaInsani();
		f.calistir();
		sonuc = f.toplama(4, 4);
		System.out.println(" Finlandiya insan� toplam sonucu : "+sonuc);
		
	}

}

package com.hokumus.obj.abst;

public class Runner {
	
	public static void main(String[] args) {
		TurkInsani t = new TurkInsani();
		t.calistir();
		int sonuc =t.toplama(4, 4);
		System.out.println(" Türk insaný toplam sonucu : "+sonuc);
		FinlandiyaInsani f = new FinlandiyaInsani();
		f.calistir();
		sonuc = f.toplama(4, 4);
		System.out.println(" Finlandiya insaný toplam sonucu : "+sonuc);
		
	}

}

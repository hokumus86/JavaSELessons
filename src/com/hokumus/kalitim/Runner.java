package com.hokumus.kalitim;

public class Runner {
	
	public static void main(String[] args) {
		TurkIsnani turk = new TurkIsnani();
		turk.boy = 175;
		turk.gozRengi = "kahve rengi";
		turk.sabirsizlik ="Evet";
		turk.sacTipi = 1;
		turk.sicakKanlimi=true;
		turk.ykgkc = true;
		FinlandiyaInsani fin = new FinlandiyaInsani();
		fin.boy = 185;
		fin.gozRengi = "mavi";
		fin.cekici = true;
		fin.sacTipi = 1;
		fin.sicakKanlimi=true;
		fin.tenRengi = "beyaz";
		
		System.out.println(turk);
		System.out.println(fin);
		System.out.println(turk.boy);
		System.out.println(turk.gozRengi);
		System.out.println(turk.sabirsizlik);
		System.out.println(turk.sicakKanlimi);
		System.out.println(turk.ykgkc);
		System.out.println("///////// FÝNLANDÝYALI ///////");
		System.out.println(fin.boy);
		System.out.println(fin.cekici);
		System.out.println(fin.gozRengi);
		System.out.println(fin.sacTipi);
		System.out.println(fin.sicakKanlimi);
		System.out.println(fin.tenRengi);
	}

}

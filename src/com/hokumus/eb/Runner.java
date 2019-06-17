package com.hokumus.eb;

public class Runner {
	public static void main(String[] args) {
		Ogrenci ogrenci1 = new Ogrenci();
		Ogrenci ogrenci2 = new Ogrenci("Yunus");
		System.out.println(ogrenci1.adi);
		System.out.println(ogrenci2.adi);
		
		Ogrenci ogrenci3 = new Ogrenci("Selin","25132132", 19);
		System.out.println(ogrenci3.adi);
		System.out.println(ogrenci3.TCKimlikNo);
		System.out.println(ogrenci3.yas);
		System.out.println("---------------------------");
		System.out.println(ogrenci3.toString());
	
	}

}

package com.hokumus.soyagaci;

public class Runner {
	public static void main(String[] args) {
		Insan hokumus = new Insan();
		hokumus.adi = "hüseyin";
		hokumus.soyadi = "OKUMUÞ";
		Insan annem = new Insan();
		annem.adi="Sultan";
		Insan babam = new Insan();
		babam.adi="Ahmet";
		hokumus.anne = annem;
		hokumus.baba = babam;
		Insan dede = new Insan();
		dede.adi = "Ömer";
		hokumus.baba.baba = dede;
		
		System.out.println(hokumus.adi);
		System.out.println(hokumus.soyadi);
		System.out.println(hokumus.anne.adi);
		System.out.println(hokumus.baba.adi);
		System.out.println(hokumus.baba.baba.adi);
		System.out.println(hokumus.anne.anne.adi);
		System.out.println(hokumus.anne.anne.anne.baba.adi);
		System.out.println(hokumus.anne.baba.baba.anne.adi);
	}
}

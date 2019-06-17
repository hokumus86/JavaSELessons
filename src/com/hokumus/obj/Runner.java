package com.hokumus.obj;

import java.util.Date;

public class Runner {
	public static void main(String[] args) {
		Ogrenci alp = new Ogrenci();
		alp.adiSoyadi = "Alper UZUN";
		alp.dogumTarihi = new Date();
		alp.TcKNo = "32121312";
		alp.yas = 43;
		System.out.println(alp.adiSoyadi);
		System.out.println(alp.yas);
		System.out.println(alp.dogumTarihi);
		Ogrenci yns = new Ogrenci();
		yns.adiSoyadi = "Yunus YAKA";
		yns.yas = 28;
		System.out.println(yns.adiSoyadi);
		System.out.println(yns.yas);
		System.out.println(yns.toString());

		com.hokumus.eb.Ogrenci ogr = new com.hokumus.eb.Ogrenci();

	}

}

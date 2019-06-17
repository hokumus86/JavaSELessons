package com.hokumus.eb;

public class Ogrenci {
	
	public String TCKimlikNo;
	public String adi = "Utku";
	public int yas;
	protected int boy;

	public Ogrenci() {
		yas=4;
			
	}

	public Ogrenci(String adiSoyadi) {
		adi=adiSoyadi;
		
	}
	
	public Ogrenci (String adi, String TCKimlikNo, int yas) {
		this.adi=adi;
		this.TCKimlikNo=TCKimlikNo;
		this.yas=yas;
	}
	
	@Override
	public String toString() {
		
		return adi + " " + TCKimlikNo +" " + yas;
	}
}

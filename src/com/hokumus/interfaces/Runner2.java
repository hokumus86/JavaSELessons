package com.hokumus.interfaces;

public class Runner2 {
	
	public static void main(String[] args) {
		Calisabilir[] calisanlar = new Calisabilir[2];
		calisanlar[0] = new Insan();
		calisanlar[1] = new Robot();
		
	
		
		
		for (Calisabilir calisan : calisanlar) {
			
			calisan.calis();
			
		}
		
		
	}

}

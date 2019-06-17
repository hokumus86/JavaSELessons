package com.hokumus.obj.sirala;

public class Runner {
	
	public static void main(String[] args) {
		
		Siralanabilir [] arabalar = new Siralanabilir[7];
		arabalar[0] = new Araba("Audi RS5 ", 2017);
		arabalar[1] = new Araba("BMW ", 2015);
		arabalar[2] = new Araba("Mercedes ", 2018);
		arabalar[3] = new Araba("Maserati ", 2019);
		arabalar[4] = new Araba("Ferrari ", 2012);
		arabalar[5] = new Araba("Lamborgini ", 2020);
		arabalar[6] = new Araba("Porche ", 2016);
		
		
		
		
		//Arrays.sort(arabalar);
		sort(arabalar);
		for (Siralanabilir araba : arabalar) {
			System.out.println(araba);
			
		}
		
		Siralanabilir [] cantalar = new Siralanabilir[7];
		cantalar[0] = new Canta("LV ", 5000);
		cantalar[1] = new Canta("Vakko ", 10000);
		cantalar[2] = new Canta("Matmazel ", 500);
		cantalar[3] = new Canta("Guess ", 2000);
		cantalar[4] = new Canta("Tommy Hilfiger ", 7500);
		cantalar[5] = new Canta("Michael ... ", 750);
		cantalar[6] = new Canta("Porche ", 1200);
		sort(cantalar);
		
		
		System.out.println("**********************************************");
		for (Siralanabilir canta : cantalar) {
			System.out.println(canta);
			
		}
		
	}
	
	
	
	
	
	public static void sort(Siralanabilir[] liste) {
		for(int i = 0 ; i< liste.length;i++) {
			for (int y = i+1; y < liste.length; y++) {
				if(liste[i].karsilastir(liste[y])==-1) {
					 Siralanabilir temp = liste[i];
					 liste[i]= liste[y];
					 liste[y] = temp;
				}
					
				
			}
			
		}
		
	}

}

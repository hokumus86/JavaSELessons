package com.hokumus.eb.setcoll;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Runner {
	
	
	public static void main(String[] args) {
		Set<String> liste = new HashSet<String>();
		liste.add("Ankara");
		liste.add("Istanbul");
		liste.add("Bursa");
		liste.add("Bursa"); /// set kullanýyorsanýz veri uniqe olur
		System.out.println(liste);
		Object [] listem =liste.toArray();
		for (Object temp : listem) {
			System.out.println(temp);
		}
		
		System.out.println("*************************");
		Iterator<String> iter = liste.iterator();
		while(iter.hasNext()) {
			String temp = iter.next();
			System.out.println(temp);
		}
		
	}

}

package com.hokumus.eb.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Runner {

	public static void main(String[] args) {
		ArrayList isimler = new ArrayList();
		isimler.add("hüseyin");
		isimler.add(5);
		isimler.add("hüseyin");
		isimler.add(true);
		isimler.add(5.5f);
		isimler.add("deneme");
		isimler.add(5.5f);
		isimler.add(188); // byte object type olmadýðý için
		// listeye eklenirken integera konvert edilir

		isimler.remove(5.5f);
		System.out.println("**********************************");
		Iterator iter = isimler.iterator();
		while(iter.hasNext()) {
			Object obj = iter.next();
			System.out.println(obj);
		}
		System.out.println("**********************************");
		// Byte
		// byte b = (byte) isimler.get(4);
		// double d1 = (double)isimler.get(2);
		// System.out.println(d1);
		for (int i = 0; i < isimler.size(); i++) {
			System.out.println(isimler.get(i));

		}


		Vector<String> vek = new Vector<String>();
		System.out.println(vek);

		List<String> liste = new ArrayList<String>();

		Collection<String> col = new ArrayList<String>();
		Iterable<Integer> it = new ArrayList<Integer>();

		// double d = isimler.get(2);

	}

}

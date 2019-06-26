package com.hokumus.eb.mapuse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Runner {
	
	public static void main(String[] args) {
		Map<Integer, String> iller = new HashMap<Integer, String>();
		iller.put(01, "Adana");
		iller.put(06, "Ankara");
		iller.put(34, "Istanbul");
		iller.put(35, "Ýzmir");
		iller.put(35, "Adana");
		System.out.println(iller);
		
		ArrayList<ArrayList<ArrayList<String>>> listem = new ArrayList<ArrayList<ArrayList<String>>>();
		ArrayList<String>  l = new ArrayList<String>();
		l.add("hüseyin");
		l.add("alper");
				ArrayList<String>  k = new ArrayList<String>();
		k.add("hüseyin");
		k.add("alper");
		
		ArrayList<ArrayList<String>>  list  = new ArrayList<ArrayList<String>>();
		list.add(l);
		list.add(k);
		listem.add(list);
		
		System.out.println(listem.get(0).get(0).get(0));
		
		
	}

}

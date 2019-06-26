package com.hokumus.eb.arraylist;

public class BenimArrayListim<T> {
	int lastsize= 0;
	
	
	
	public void ekle(T degisten) {
		
		if (degisten instanceof Integer) {
			
		}
		
		else if( degisten instanceof Float) {
			
		}
		
		Object[] def = new Object[10];
		Object[] temp = new Object[def.length];
		temp = def;
		def = new Object[temp.length+10];
		for (int i = 0; i < temp.length; i++) {
			def[i] = temp[i];
			
		}
		def[lastsize] = 6;
		
		lastsize++;
		
		
	}

}

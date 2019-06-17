package com.hokumus.getset;

public class Isci {
	
	private String adiSoyadi;
	private String tc;
	private int maas;
	private int mesai;
	private boolean vardiya;
	
	public void setAdiSoyadi(String adiSoyadi) {
		this.adiSoyadi = adiSoyadi;
	}
	
	public String getAdiSoyadi() {
		return this.adiSoyadi;
	}
	
	public void setMaas(int maas){
		this.maas=maas;
	}
	
	public int getMaas() {
		return this.maas;
	}
	
	
	public void setVardiya(boolean vardiya) {
		this.vardiya= vardiya;
	}
	
	public boolean isVardiya() {
		return vardiya;
	}

}

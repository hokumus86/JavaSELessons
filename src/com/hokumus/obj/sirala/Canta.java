package com.hokumus.obj.sirala;

public class Canta implements Siralanabilir {

	private String marka;
	private int fiyat;

	public Canta(String marka, int fiyat) {
		this.marka = marka;
		this.fiyat = fiyat;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

	@Override
	public int karsilastir(Object obj) {
		int sonuc = 0;
		Canta can = (Canta) obj;
		if (can.getFiyat() > getFiyat())
			sonuc = 1;
		else
			sonuc = -1;
		return sonuc;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Çanta Marka :");
		sb.append(getMarka());
		for (int i = 0; i < 15 - getMarka().length(); i++) {
			sb.append(" ");
		}
		sb.append("Fiyat :");
		sb.append(getFiyat());

		return sb.toString();
	}

}

package com.hokumus.obj.sirala;

public class Araba implements Siralanabilir, Comparable<Araba> {
	private int model;
	private String marka;
	
	public Araba(String marka, int model) {
		this.marka = marka;
		this.model = model;
		// TODO Auto-generated constructor stub
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	@Override
	public int karsilastir(Object obj) {

		Araba arac = (Araba) obj;
		int sonuc = 0;
		if (arac.getModel() > getModel())
			sonuc = 1;
		else
			sonuc = -1;
		return sonuc;

	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Araba Marka :");
		sb.append(getMarka());
		for (int i = 0; i < 15 - getMarka().length(); i++) {
			sb.append(" ");
		}
		sb.append("Model :");
		sb.append(getModel());

		return sb.toString();
	}

	@Override
	public int compareTo(Araba o) {
		Araba arac = (Araba) o;
		int sonuc = 0;
		if (arac.getModel() < getModel())
			sonuc = 1;
		else
			sonuc = -1;
		return sonuc;
	}

}

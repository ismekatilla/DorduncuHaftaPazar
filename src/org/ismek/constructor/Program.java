package org.ismek.constructor;

public class Program {

	public static void main(String[] args) {
		Muzik cansununDinledigiMuzik = new Muzik();
		cansununDinledigiMuzik.adi = "ABC";
		cansununDinledigiMuzik.artist = "DEF";
		cansununDinledigiMuzik.turu = "ARABESK";
		cansununDinledigiMuzik.suresiSaniye = 15;
		muzikAdiniYazdir(cansununDinledigiMuzik);

	}
	
	static void muzikAdiniYazdir(Muzik muzik) {
		System.out.println(muzik.adi);
	}

}
package org.ismek.constructor;

public class Sertifika {

	String okulAdi;
	String ogrenciAdi;
	
	public Sertifika() {
		
	}
	
	public Sertifika(String okul) {
		okulAdi = okul;
	}
	
	public void sertifikaUret() {
		System.out.println("------------" + okulAdi + "--------------");
		System.out.println("Bu sertifikayı kazandınız. Hayatınızda Başarılar.");
		System.out.println("Tebrikler " + ogrenciAdi);
		System.out.println("------------------------------------------");
	}
}

package org.ismek.constructor;

public class Program2 {

	public static void main(String[] args) {
		Sertifika sertifikaAli = new Sertifika();
		sertifikaAli.ogrenciAdi = "ALİ VELİ";
		sertifikaAli.okulAdi = "FATİH BİLİŞİM";
		sertifikaAli.sertifikaUret();
		
		Sertifika sertifikaAhmet = new Sertifika();
		sertifikaAhmet.ogrenciAdi = "AHMET MEHMET";
		sertifikaAhmet.okulAdi = "İSMEK";
		sertifikaAhmet.sertifikaUret();
		
		Sertifika sertifikaAyse = new Sertifika("YENİKAPI");
		sertifikaAyse.ogrenciAdi = "AYŞE HANIM";
		sertifikaAyse.sertifikaUret();
	}

}

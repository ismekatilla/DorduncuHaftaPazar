package statik;

public class Program {

	public static void main(String[] args) {
		Sertifika sertifika1 = new Sertifika();
		sertifika1.okulAdi = "ABCD";
		sertifika1.ogrenciAdi = "DASDAS";
		System.out.println(sertifika1.sertifikaVerilenOgreciSayisi);
		
		Sertifika sertifika2 = new Sertifika();
		sertifika2.okulAdi = "ftgyttry";
		sertifika2.ogrenciAdi = "3423sdfsd";
		System.out.println(sertifika2.sertifikaVerilenOgreciSayisi);
		
		System.out.println(Sertifika.sertifikaVerilenOgreciSayisi);
		
		int toplam = KapaliClass.topla(5, 7);
		System.out.println(toplam);
	}
}
package statik;

public class Sertifika {

	String okulAdi;
	String ogrenciAdi;
	static int sertifikaVerilenOgreciSayisi;
	
	public Sertifika() {
		sertifikaVerilenOgreciSayisi++;
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

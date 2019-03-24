package org.ismek.metod;

public class MetodOverload {

	public static void main(String[] args) {
		int toplam1 = topla(3, 45);
		System.out.println(toplam1);
		
		int toplam2 = topla("3", "11");
		System.out.println(toplam2);
		
		int toplam3 = topla(3, 45, 23);
		System.out.println(toplam3);
	}
	
	static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	static int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1 + sayi2 + sayi3;
	}

	static int topla(String sayi1, String sayi2) {
		int sayi1AsInt = Integer.parseInt(sayi1);
		int sayi2AsInt = Integer.parseInt(sayi2);
		return sayi1AsInt + sayi2AsInt;
	}
}

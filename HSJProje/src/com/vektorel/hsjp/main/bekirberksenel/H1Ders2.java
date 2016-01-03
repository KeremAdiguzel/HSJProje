package com.vektorel.hsjp.main.bekirberksenel;

import java.util.Scanner;

public class H1Ders2 {

	public static void main(String[] args) {
		
		System.out.println("Uygulama calismaya basladi.");
		
		H1Ders2 metod = new H1Ders2();
		
		metod.kullaniciEtkilesimliMetod();
		
		System.out.println("Uygulama sona erdi.");
		
	}
	
	public void kullaniciEtkilesimliMetod() {
		
		System.out.println("Kullanici etkilesimli metod calismaya basladi.");

		Scanner k = new Scanner(System.in);
		
		System.out.println("Bir mesaj giriniz.");
		
		String mesaj = k.nextLine();
		
		System.out.println(mesaj.toUpperCase()); //Kullanicidan aldigimiz mesajin tum harflerini buyuk yazdi.
		
		System.out.println("Kullanici etkilesimli metod bitti.");
		
	}
	
}

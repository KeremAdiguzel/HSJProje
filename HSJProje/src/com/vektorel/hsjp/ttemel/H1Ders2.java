package com.vektorel.hsjp.ttemel;

import java.util.Scanner;

public class H1Ders2 {

	
	public static void main(String[] args) {
		System.out.println("Uygulama �al��maya Ba�lad�");
		H1Ders2 ders2=new H1Ders2();
		ders2.kullaniciEtkilesimliMetod();
		System.out.println("Uygulama Bitti");
	}
	
	
	public void kullaniciEtkilesimliMetod() {
		System.out.println("kullaniciEtkilesimliMetod �al��maya Ba�lad�");
		Scanner scannerKullanicidanOkuyucu=new Scanner(System.in);
		System.out.println("Bir Metin Giriniz :");
		String degisken = scannerKullanicidanOkuyucu.nextLine();
		System.out.println(degisken);
		System.out.println("kullaniciEtkilesimliMetod Bitti ");
	}
}

package com.vektorel.hsjp.ttemel;

import java.util.Scanner;

public class HelloWorld {
	
	
	
	public static void main(String[] args) {		
		
		HelloWorld testNesneKopyasi = new HelloWorld();		
		testNesneKopyasi.basitTekrarciMetod();
		
//		testNesneKopyasi.ekranaMesajYazanMetod();
//		
//		testNesneKopyasi.ekranaMesajYazanMetod();
//		
//		testNesneKopyasi.ekrandanMesajAlanMetod();		
		
		/* Basit
		  Bir
		 A��klama  */
	}
	
	
	public void ekranaMesajYazanMetod() {
		
		System.out.println("ekranaMesajYazanMetod �al��maya Ba�lad�");
		
		System.out.println("Merhaba D�nya");
		
		System.out.println("ekranaMesajYazanMetod Bitti");

	}
	
	public void ekrandanMesajAlanMetod() {
		
		Scanner scanner=new Scanner(System.in);
		
		String kullanicininGirdigiMesaj = scanner.nextLine();
		
		System.out.println("Kullan�c�n�n Girdi�i Mesaj =" + kullanicininGirdigiMesaj );

	}
	
	public void basitTekrarciMetod() {
		
		Scanner scanner=new Scanner(System.in);
		
		String kullanicininGirdigiMesaj = scanner.nextLine();
		
		System.out.println(kullanicininGirdigiMesaj + kullanicininGirdigiMesaj+" "+ kullanicininGirdigiMesaj);

	}

}


































package com.vektorel.hsjp.ttemel;

import java.util.Scanner;

public class HelloWorld {
	
	
	
	public static void main(String[] args) {
		
		
		HelloWorld testNesneKopyasi = new HelloWorld();
		
		
		testNesneKopyasi.ekranaMesajYazanMetod();
		
		testNesneKopyasi.ekranaMesajYazanMetod();
		
		testNesneKopyasi.ekrandanMesajAlanMetod();
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

}


































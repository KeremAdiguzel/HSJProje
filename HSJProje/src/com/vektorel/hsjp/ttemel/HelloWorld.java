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
		
		System.out.println("ekranaMesajYazanMetod Çalýþmaya Baþladý");
		
		System.out.println("Merhaba Dünya");
		
		System.out.println("ekranaMesajYazanMetod Bitti");

	}
	
	public void ekrandanMesajAlanMetod() {
		
		Scanner scanner=new Scanner(System.in);
		
		String kullanicininGirdigiMesaj = scanner.nextLine();
		
		System.out.println("Kullanýcýnýn Girdiði Mesaj =" + kullanicininGirdigiMesaj );

	}

}


































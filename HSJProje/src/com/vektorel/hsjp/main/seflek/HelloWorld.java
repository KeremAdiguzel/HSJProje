package com.vektorel.hsjp.main.seflek;

import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) {
		HelloWorld test =new HelloWorld(); 
//		test.ekranaMesajYazanMetod();
//		test.ekranaMesajYazanMetod();
//		test.ekrandanMesajAlanMetod();
		test.basitTekrarciMetod();
	}
	
	public static void ekranaMesajYazanMetod() {

		System.out.println("ekranaMesajYazanMetod çalýþmaya baþladý");
		
		System.out.println("Merhaba Dünya");
		
		System.out.println("ekranaMesajYazanMetod Bitti");
	}
		public void ekrandanMesajAlanMetod() {
			Scanner scanner =new Scanner(System.in);
			String kullanicininGirdiðiMesaj = scanner.nextLine();
			
			System.out.println("Kullancýnýn Girdiði Mesaj=" + kullanicininGirdiðiMesaj);
				

		}
		
		public void basitTekrarciMetod() {
			
			Scanner scanner =new Scanner(System.in);
			String kullanicininGirdiðiMesaj = scanner.nextLine();
			
			System.out.println(kullanicininGirdiðiMesaj +" "+ kullanicininGirdiðiMesaj +" "+ kullanicininGirdiðiMesaj);

		}

	}

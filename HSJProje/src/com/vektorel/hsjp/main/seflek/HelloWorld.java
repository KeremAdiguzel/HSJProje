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

		System.out.println("ekranaMesajYazanMetod �al��maya ba�lad�");
		
		System.out.println("Merhaba D�nya");
		
		System.out.println("ekranaMesajYazanMetod Bitti");
	}
		public void ekrandanMesajAlanMetod() {
			Scanner scanner =new Scanner(System.in);
			String kullanicininGirdi�iMesaj = scanner.nextLine();
			
			System.out.println("Kullanc�n�n Girdi�i Mesaj=" + kullanicininGirdi�iMesaj);
				

		}
		
		public void basitTekrarciMetod() {
			
			Scanner scanner =new Scanner(System.in);
			String kullanicininGirdi�iMesaj = scanner.nextLine();
			
			System.out.println(kullanicininGirdi�iMesaj +" "+ kullanicininGirdi�iMesaj +" "+ kullanicininGirdi�iMesaj);

		}

	}

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

		System.out.println("ekranaMesajYazanMetod çalışmaya başladı");
		
		System.out.println("Merhaba Dünya");
		
		System.out.println("ekranaMesajYazanMetod Bitti");
	}
		public void ekrandanMesajAlanMetod() {
			Scanner scanner =new Scanner(System.in);
			String kullanicininGirdiğiMesaj = scanner.nextLine();
			
			System.out.println("Kullancının Girdiği Mesaj=" + kullanicininGirdiğiMesaj);
				

		}
		
		public void basitTekrarciMetod() {
			
			Scanner scanner =new Scanner(System.in);
			String kullanicininGirdiğiMesaj = scanner.nextLine();
			
			System.out.println(kullanicininGirdiğiMesaj +" "+ kullanicininGirdiğiMesaj +" "+ kullanicininGirdiğiMesaj);

		}

	}

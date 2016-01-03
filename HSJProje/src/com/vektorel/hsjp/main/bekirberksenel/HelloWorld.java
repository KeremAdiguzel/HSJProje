package com.vektorel.hsjp.main.bekirberksenel;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		HelloWorld test = new HelloWorld();
	
		test.ekranayaziyazanmetod(); 
		
		HelloWorld tt = new HelloWorld();
		
		tt.ekranayaziyazdiranmetod();
		
	}	
	
	public void ekranayaziyazanmetod() {
		
		System.out.println("Ekrana yazi yazan metod calismaya basladi.");
		
		System.out.println("Merhaba Dunya!");
		
		System.out.println("Ekrana yazi yazan metod bitti !");
		
	}

	public void ekranayaziyazdiranmetod() {
		
		System.out.println("Ekrana yazi yazdiran metod basladi.");
		
		Scanner k = new Scanner(System.in);
		
		String KullanicininGirdigiMesaj = k.nextLine();
		
		System.out.println("Ekrana yazilan yazi = " + KullanicininGirdigiMesaj);
		
		System.out.println("Ekrana yazi yazdiran metod bitti.");
		
	}
}



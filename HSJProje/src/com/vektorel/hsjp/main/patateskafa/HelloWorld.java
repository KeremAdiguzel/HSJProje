package com.vektorel.hsjp.main.patateskafa;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {

		HelloWorld test = new HelloWorld();
		
		test.ekranaMesaj();
		
		test.ekranaMesaj();
		
		test.mesajAlanMetod();
		
		
	}

	public void ekranaMesaj() {
		System.out.println("ekranaMesaj �al��maya ba�lad�");
		System.out.println("Merhaba D�nya");
		System.out.println("ekranaMesaj bitti");
	}
	
	public void mesajAlanMetod() {
	 Scanner tarayici = new Scanner(System.in);
	 String kullaniciGirdisi = tarayici.nextLine();
	 System.out.println("Kullan�c�n�n girdi�i mesaj: " + kullaniciGirdisi);
	}
}

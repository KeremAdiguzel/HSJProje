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
		System.out.println("ekranaMesaj çalýþmaya baþladý");
		System.out.println("Merhaba Dünya");
		System.out.println("ekranaMesaj bitti");
	}
	
	public void mesajAlanMetod() {
	 Scanner tarayici = new Scanner(System.in);
	 String kullaniciGirdisi = tarayici.nextLine();
	 System.out.println("Kullanýcýnýn girdiði mesaj: " + kullaniciGirdisi);
	}
}

package com.vektorel.hsjp.main.patateskafa;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {

		HelloWorld test = new HelloWorld();
//		test.ekranaMesaj();
//		test.mesajAlanMetod();
		test.basitTekrarciMetod();
		System.out.println("Bitti.");
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
	
	public void basitTekrarciMetod() {
	Scanner tarayici = new Scanner(System.in);	
	String kullaniciGirdisi = tarayici.nextLine();
	if(kullaniciGirdisi.length() > 1){
		System.out.println(kullaniciGirdisi.substring(2) +" "+ kullaniciGirdisi.toUpperCase() +" "+ kullaniciGirdisi);
	}
	else{
	
		System.out.println(kullaniciGirdisi +" "+ kullaniciGirdisi.toUpperCase() +" "+ kullaniciGirdisi);
	}
	}
}

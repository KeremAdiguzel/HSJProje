package com.vektorel.hsjp.main.melisceylan;
//string::c�mle/kelime/harf tan�mlar (say� tan�mlanamaz kabul edilmez.)
import java.util.Scanner;
public class helloworld {
	public static void main (String[] args){
		helloworld test = new helloworld();
		test.ekranaMesajYazanMetod();
		test.ekrandanMesajAlanMetod();
		test.basitTekrarciMetod();
	}
	public void ekranaMesajYazanMetod() {
		System.out.println("Hello World!!");
	}
	public void ekrandanMesajAlanMetod(){
		Scanner k = new Scanner(System.in);
		System.out.println("Mesaj�n�z� nedir?");
		String mesaj = k.nextLine();
		System.out.println("Mesaj :: " +mesaj);
		k.close();
	}
	public void basitTekrarciMetod() {
		Scanner k = new Scanner(System.in);
		System.out.println("Mesaj�n�z nedir?");
		String mesaj = k.nextLine();
		System.out.println("Mesaj :: " + mesaj.toUpperCase() + mesaj + mesaj.toUpperCase()); 
		// toUpperCase metodu stringi b�y�k harfle yazar.
		}
}

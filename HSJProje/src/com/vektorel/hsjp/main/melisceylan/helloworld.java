package com.vektorel.hsjp.main.melisceylan;

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
		System.out.println("Mesajýnýzý nedir?");
		String mesaj = k.nextLine();
			System.out.println("Mesaj :: " +mesaj);
	}
	public void basitTekrarciMetod() {
		Scanner k = new Scanner(System.in);
		System.out.println("Mesajýnýz nedir?");
		String mesaj = k.nextLine();
		System.out.println("Mesaj :: " + mesaj + mesaj + mesaj);
	}
	
}

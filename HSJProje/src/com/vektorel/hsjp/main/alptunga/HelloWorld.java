package com.vektorel.hsjp.main.alptunga;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

		HelloWorld test = new HelloWorld();
		test.basitTekrarciMetod();
/*	test.ekranaMesajYazanMetod(); 
		test.ekrandanMesajAlanMetod(); */
	}
	
	public void ekranaMesajYazanMetod() {
		System.out.println("Merhaba Dünya");
		
	}
	
	public void ekrandanMesajAlanMetod() {
		Scanner klavye = new Scanner(System.in);
		String mesaj = klavye.next();
		
		System.out.println("kullanýcýnýn girdiði mesaj =" + mesaj);
	}


	public void basitTekrarciMetod() {
		Scanner klavye = new Scanner(System.in);
		String mesaj = klavye.nextLine();
		System.out.println(mesaj.toUpperCase()+mesaj.toLowerCase()+mesaj);
	}


}

package com.vektorel.hsjp.main.alptunga;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

		HelloWorld test = new HelloWorld();
		test.ekranaMesajYazanMetod();
		test.ekrandanMesajAlanMetod();
	}
	
	public void ekranaMesajYazanMetod() {
		System.out.println("Merhaba Dünya");
	}
	
	
public void ekrandanMesajAlanMetod() {
	Scanner klavye = new Scanner(System.in);
	String mesaj = klavye.nextLine();
	
	System.out.println("kullanýcýnýn girdiði mesaj =" + mesaj);
}
	

}
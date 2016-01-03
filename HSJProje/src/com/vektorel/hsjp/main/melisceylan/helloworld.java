package com.vektorel.hsjp.main.melisceylan;

import java.util.Scanner;

public class helloworld {
	public static void main (String[] args){
		helloworld test = new helloworld();
		test.ekranaMesajYazanMetod();
		test.ekrandanMesajAlanMetod();
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
}

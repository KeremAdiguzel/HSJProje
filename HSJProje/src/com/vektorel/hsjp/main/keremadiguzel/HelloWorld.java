package com.vektorel.hsjp.main.keremadiguzel;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		HelloWorld deneme =new HelloWorld();
		HelloWorld sayial =new HelloWorld();
		
		System.out.println("bir deðer girin");
		sayial.sayiAl();
		
		
		
		System.out.println("Merhaba Dünya");
		  
		deneme.fonksiyon();
		   
	}
   public void sayiAl() {
	   Scanner yýldýz= new Scanner(System.in);
	   int c = yýldýz.nextInt();
		System.out.println("girilen sayý  " + c);
		
	}
public void fonksiyon() {
	   int a,b ;
	   for(a=0;a<=5;a++){
		   System.out.println(" ");
		   for(b=0;b<=a;b++)
			   System.out.print("*");
		   
	   }
	
}
   
}

package com.vektorel.hsjp.main.keremadiguzel;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		HelloWorld deneme =new HelloWorld();
		HelloWorld sayial =new HelloWorld();
		
		System.out.println("bir de�er girin");
		sayial.sayiAl();
		
		
		
		System.out.println("Merhaba D�nya");
		  
		deneme.fonksiyon();
		   
	}
   public void sayiAl() {
	   Scanner y�ld�z= new Scanner(System.in);
	   int c = y�ld�z.nextInt();
		System.out.println("girilen say�  " + c);
		
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

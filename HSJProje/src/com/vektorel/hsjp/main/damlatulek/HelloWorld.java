
package com.vektorel.hsjp.main.damlatulek;
import java.util.*;
public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("just enter a word");
		
		HelloWorld run = new HelloWorld();
	//	run.ShowMsg();
	//	run.GetMsg();
		run.AgainGetMsg();
	}
		
	public void ShowMsg() {
	
		System.out.println("Please enter a word");
		
	}

	public void GetMsg() {
		
		Scanner scanner = new Scanner(System.in);
		String UsersMsg = scanner.nextLine();
		
		System.out.println("user's message = "+  UsersMsg);
		
	}
	


	public void AgainGetMsg(){
	
		Scanner scanner =  new Scanner(System.in);
		String UsersMsg = scanner.nextLine();

		System.out.println(UsersMsg +  UsersMsg);

	
}}
	
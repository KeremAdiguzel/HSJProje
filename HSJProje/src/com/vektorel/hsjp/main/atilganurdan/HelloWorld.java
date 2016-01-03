package com.vektorel.hsjp.main.atilganurdan;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		HelloWorld input = new HelloWorld();
		//input.displayInput();
		//input.getInput();
		input.iteratingInput();
	}

	public void displayInput() {
		System.out.println("DisplayInput starts");
		System.out.println("Hello World");
		System.out.println("DisplayInput finishes");

	}
	
	public void getInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a String input");
		String inputString = scan.nextLine();
		System.out.println("The input is entered: " + inputString);

	}
	
	public void iteratingInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a String input");
		String inputString = scan.nextLine();
		System.out.println(inputString +" "+ inputString +" " +inputString);
	}
}

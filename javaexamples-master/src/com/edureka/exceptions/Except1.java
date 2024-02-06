package com.edureka.exceptions;

import java.util.Scanner;

public class Except1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int x = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int y = sc.nextInt();
		
		int res = x/y; //java.lang.ArithmeticException
		
		System.out.println("Result = "+res);
		System.out.println("=========== Done ============");
	}

}

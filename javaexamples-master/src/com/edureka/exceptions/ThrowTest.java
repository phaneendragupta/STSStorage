package com.edureka.exceptions;

import java.util.Scanner;

public class ThrowTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter first number: ");
			int x = sc.nextInt();

			System.out.print("Enter second number: ");
			int y = sc.nextInt();

			if (y == 0) {
//				ArithmeticException aex = new ArithmeticException();
				ArithmeticException aex = new ArithmeticException("can't divide num by zero");
                throw aex;
			}

			int res = x / y; // Implicit exception

			System.out.println("Result = " + res);
		} 
		catch (Exception ex) {
			System.out.println("Message : "+ex.getMessage());
			System.out.println(ex.toString());
		}

	}

}

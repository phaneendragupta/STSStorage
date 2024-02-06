package com.edureka.exceptions;

import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        	System.out.print("Enter first number: ");
    		int x = sc.nextInt();
    		
    		System.out.print("Enter second number: ");
    		int y = sc.nextInt();
    		
    		int res = x/y; //java.lang.ArithmeticException
    		
    		System.out.println("Result = "+res);
        }
        catch(ArithmeticException ex) {
        	System.out.println(ex.toString());
        }
        finally {
        	System.out.println("Application Designed & Developed by");
            System.out.println("team @ Edureka");
            sc.close();
        }
		System.out.println("=========== Done ============");

	}

}

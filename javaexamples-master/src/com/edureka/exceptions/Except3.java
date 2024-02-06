package com.edureka.exceptions;

public class Except3 {

	public static void main(String[] args) {
		
			try{
				int x = Integer.parseInt(args[0]);
				int y = Integer.parseInt(args[1]);
				
				int res = x/y; //ArithmeticException,ArrayIndexOutOfBoundsException,NumberFormatException
				System.out.println(x+" / "+y+" = "+res);
			}
			catch(ArithmeticException ex) {
				System.out.println("Can't divide num by zero");
				System.out.println("hafga");
			}
			catch(NumberFormatException ex) {
				System.out.println("Please provide integers as cmd args");
				System.out.println("sweety");
			}
			catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println("Please provide min 2 cmd args");
				System.out.println("pravs");
			}
		
		System.out.println("-- DONE --");

	}

}

package com.edureka.exceptions;

import java.util.Scanner;

public class Voter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String req = "Y";
		while (req.equalsIgnoreCase("Y")) {
			try {
				System.out.println("Enter age of voter: ");
				int age = sc.nextInt();
				if (age < 18) {
					InvalidAgeException iex = new InvalidAgeException("age should be >= 18");
					throw iex;
				}
				else {
					System.out.println("VOTING DONE!");
				}
			} catch (Exception ex) {
				System.out.println(ex.toString());
			}
			System.out.println("Anyone else in queue [Y/N]: ");
			req = sc.next();

		}//while
		System.out.println("----------- DONE ------------");
		
	}



}

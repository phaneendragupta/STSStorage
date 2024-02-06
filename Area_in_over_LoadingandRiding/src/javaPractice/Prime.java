package javaPractice;

import java.util.Scanner;

/*
Write a program to check a given number is prime or not 
i/p n=34*/

public class Prime {

	public static void main(String[] args) {
     
	Scanner s=new Scanner(System.in);
	
	int n=s.nextInt();
	
	if(n%2!=0 && n%3!=0 && n%5!=0 && n%7!=0 && n!=1) {
		System.out.println(n+" is a prime number");
		
		
	}
	
	else {
		System.out.println(n+" is not a prime number");

	}
	}

}

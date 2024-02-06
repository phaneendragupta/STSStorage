package com.edureka.interfaces;

import java.util.Scanner;

public class BankTest {

	public static void main(String[] args) {
		
		Bank bank = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Which bank to work with [1.SBI | 2.ICICI]:");
		int opt = sc.nextInt();
		
		if(opt == 1) {
			bank = new SBI();
		}
		else if(opt == 2) {
			bank = new ICICI();
		}
		else {
			System.out.println("Not Valid Bank Option...");
			return;
		}
		
		bank.deposit(20000f);
		bank.withdraw(1000f);
	}

}

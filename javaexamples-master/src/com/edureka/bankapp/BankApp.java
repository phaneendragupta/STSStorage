package com.edureka.bankapp;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Account acc = null;

		while (true) {
			System.out.println("1.Create A/C");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Balance check");
			System.out.println("5.Exit");
			
			System.out.println("Enter an option from above");
			int opt = sc.nextInt();

			switch (opt) {

			case 1:
				if(acc == null) {
					System.out.println("Enter a/c no: ");
					long acno = sc.nextLong();
					sc.nextLine();
					System.out.println("Enter name: ");
					String name = sc.nextLine();
					System.out.println("Initial deposit amt: ");
					float bal = sc.nextFloat();
					//create an account obj
					acc = new Account(acno, name, bal);
					System.out.println("Account created");
				}else {
					System.out.println("FYI: Account is already created!!");
				}
				break;
				
			case 2:
				if (acc != null) {
					System.out.println("Enter Amount to deposit: ");
					float amt = sc.nextFloat();
					acc.deposit(amt);
				} else {
					System.out.println("FYI : Not a valid account or Create A/C");
				}
				break;
				
			case 3:
				if (acc != null) {
					System.out.println("Enter Amount to withdraw: ");
					float amt = sc.nextFloat();
					acc.withdraw(amt);
				} else {
					System.out.println("FYI : Not a valid account or Create A/C");
				}
				break;
				
			case 4:
				if (acc != null) {
					acc.getBalance();
				} else {
					System.out.println("FYI : Not a valid account or Create A/C");
				}
				break;
				
			case 5:
				System.out.println("---- Visit Again ----");
				sc.close();
				System.exit(0); // terminate application
				break;
				
			default:
				System.out.println("Invalid option try again");

			}// switch
			System.out.println("================================");
		} // while

	}

}

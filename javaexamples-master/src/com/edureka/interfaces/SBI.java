package com.edureka.interfaces;

public class SBI implements Bank {

	@Override
	public void deposit(float amt) {
		System.out.println("Rs."+amt+"Deposited @SBI");

	}

	@Override
	public void withdraw(float amt) {
		System.out.println("Rs."+amt+"Debited @SBI");


	}

}

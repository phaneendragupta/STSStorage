package com.edureka.interfaces;

public class ICICI implements Bank {

	@Override
	public void deposit(float amt) {
		System.out.println("Rs."+amt+"Deposited @ICICI");

	}

	@Override
	public void withdraw(float amt) {
		System.out.println("Rs."+amt+"Debited @ICICI");


	}

}

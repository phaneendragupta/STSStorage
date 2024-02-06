package com.edureka.exceptions;

class Bank{
	public void deposit(float amt) throws InterruptedException{
		System.out.println("Depositing Rs."+amt);
		//logic 
	}
}

public class ThrowsTest {

	public static void main(String[] args) throws InterruptedException {
		Bank sbi = new Bank();
//		try {
//			sbi.deposit(2500f);
//		}
//		catch(Exception ex) {
//			
//		}
		sbi.deposit(0);

	}

}

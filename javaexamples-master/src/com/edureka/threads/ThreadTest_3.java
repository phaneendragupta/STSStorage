package com.edureka.threads;

class Naturals extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
}

class Evens extends Thread{
	public void run() {
		for(int i=2;i<=20;i+=2) {
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
}
public class ThreadTest_3 {

	public static void main(String[] args) {
		Naturals nat = new Naturals();
		Evens eve = new Evens();
		
		nat.setName("Naturals: ");
		eve.setName("Evens: ");
		
		//eve.setPriority(10);

		nat.start();
		eve.start();
		
	}

}

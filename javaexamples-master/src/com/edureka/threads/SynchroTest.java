package com.edureka.threads;

class MTable {
	synchronized void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			int p = n * i;
			System.out.println(n + " x " + i + " = " + p);
			try {
				Thread.sleep(1500);
			} catch (Exception ex) {
			}
		} // for loop
		System.out.println("===================");
		try {
			Thread.sleep(4000);
		} catch (Exception ex) {
		}
	}
}

class MyThread1 extends Thread {
	MTable table;

	MyThread1(MTable t) {
		this.table = t;
	}

	public void run() {
		table.printTable(5);
	}
}

class MyThread2 extends Thread {
	MTable table;

	MyThread2(MTable t) {
		this.table = t;
	}

	public void run() {
		table.printTable(6);
	}
}

public class SynchroTest {

	public static void main(String[] args) {
		MTable mt = new MTable();
		MyThread1 ct1 = new MyThread1(mt);
		MyThread2 ct2 = new MyThread2(mt);

		ct1.start();
		ct2.start();

	}

}

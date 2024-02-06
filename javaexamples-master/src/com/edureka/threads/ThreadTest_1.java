package com.edureka.threads;

class MyTask1 implements Runnable{

	@Override
	public void run() {
		System.out.println("---Inside run method---");
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println("---run method completed---");

	}
	
}
public class ThreadTest_1 {

	public static void main(String[] args) {
		System.out.println("No of Active Threads = "+Thread.activeCount());
		System.out.println("---Inside main method---");
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		MyTask1 task1 = new MyTask1();
		//creating child thread for MyTask1 object
		Thread ct = new Thread(task1);
		ct.start();
		Thread ct2 = new Thread(task1);
		ct2.start();
		
		System.out.println("No of Active Threads = "+Thread.activeCount());

	}

}

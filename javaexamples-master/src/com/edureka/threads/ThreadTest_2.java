package com.edureka.threads;

class MyTask2 extends Thread{

	@Override
	public void run() {
		System.out.println("---Inside run method---");
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println("---run method completed---");

	}
	
}
public class ThreadTest_2 {

	public static void main(String[] args) {
		System.out.println("No of Active Threads = "+Thread.activeCount());
		System.out.println("---Inside main method---");
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		MyTask2 task = new MyTask2();
		task.start();
//		Thread ct2 = new Thread(task1);
//		ct2.start();
		
		System.out.println("No of Active Threads = "+Thread.activeCount());

	}

}

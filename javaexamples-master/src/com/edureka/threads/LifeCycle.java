package com.edureka.threads;

public class LifeCycle {

	public static void main(String[] args) throws InterruptedException {
		Thread t = Thread.currentThread();
		for(int i =1;i<=10;i++) {
			System.out.println(t.getName().toUpperCase()+" - "+i);
			Thread.sleep(2000); //2000msec
			if(i==4) {
				t.stop();  
			}
		}
	}

}

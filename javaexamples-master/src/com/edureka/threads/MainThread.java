package com.edureka.threads;

public class MainThread {

	public static void main(String[] args) {
		
		int count_threads = Thread.activeCount();
		System.out.println("No of Active Threads = "+ count_threads);
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		System.out.println("Name : "+t.getName());
		System.out.println("Priority : "+t.getPriority());
		ThreadGroup tgrp = t.getThreadGroup();
		System.out.println(tgrp);
		
		t.setName("Edureka");
		t.setPriority(10);
		System.out.println(t);
	}

}

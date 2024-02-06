package com.edureka.polymorphism;

public class Counter {
	static int n = 10;
	
	void inc() {
		n = n+1;
	}
	
	public static void main(String[] args) {
		Counter obj1= new Counter();
		Counter obj2= new Counter();
		Counter obj3= new Counter();
		
		obj1.inc();
		System.out.println(obj1.n);
		obj2.inc();
		System.out.println(obj2.n);
		obj3.inc();
		System.out.println(obj3.n);
	}
}

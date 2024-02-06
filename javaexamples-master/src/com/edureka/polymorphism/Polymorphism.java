package com.edureka.polymorphism;

class A{
	void display() {
		System.out.println("Inside class A");
	}
}

class B extends A{
	@Override
	void display() {
		System.out.println("Inside class B");
	}
}

public class Polymorphism {
	
	public static void main(String[] args) {
		//A obj = new A();//compiler tells to call method A.display()
		//B obj = new B();//compiler tells to call method B.display()
		A obj =new B(); //compiler is telling to call method A.display() but goes to method B.display()
		obj.display();
	}

}

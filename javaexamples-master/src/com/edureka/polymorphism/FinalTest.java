package com.edureka.polymorphism;

//final class Ab{ //final class can't be extended
class Ab {
	// final void display() {//Cannot override the final method from Ab
	void display() {}
}

class C extends Ab {
	void display() {}
}

public class FinalTest {

	final int n = 20;// instance variable

	public static void main(String[] args) {
		final int n = 25; // local variable
		System.out.println(n);

		// n = 26;// final local variable n cannot be assigned
		System.out.println(n);

		FinalTest obj = new FinalTest();
		System.out.println(obj.n);

		// obj.n=20;//The final field FinalTest.n cannot be assigned
		System.out.println(obj.n);

	}

}
